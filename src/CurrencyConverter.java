import api.ConnectionAPI;
import api.ResponseApi;
import classes.Listings;
import classes.Reader;
import classes.Bargain;

import java.io.BufferedReader;
import java.io.IOException;

import static classes.CurrencyValidator.validCurrencyCodes;


public class CurrencyConverter {
    public static void main(String[] args) {
        try {
            ConnectionAPI api = new ConnectionAPI();
            Listings listings = new Listings();
            Reader reader = new Reader(); //
            // Show the catalog

            boolean continuar = true;
            while (continuar) {
                    listings.showListings(reader);

                    String currency = null;
                    String currency2 = null;

                    while (true) {
                        System.out.println("Digite o código da moeda de origem:");
                        currency = reader.readString();

                        if (isValidCurrencyCode(currency)) {
                            break;
                        } else {
                            System.out.println("Erro: Código de moeda inválido. Por favor, insira um código de moeda válido.");
                        }
                    }

                    if (!continuar) break;

                    while (true) {
                        System.out.println("Digite o código da moeda de destino:");
                        currency2 = reader.readString();

                        if (isValidCurrencyCode(currency2)) {
                            break;
                        } else {
                            System.out.println("Erro: Código de moeda inválido. Por favor, insira um código de moeda válido.");
                        }
                    }


                    if (!continuar) break;

                    System.out.println("Digite o valor a ser convertido:");
                    double amount = reader.readDouble();

                    ResponseApi response = api.connect(currency, currency2, String.valueOf(amount));

                    if (response != null) {
                        Bargain bargain = new Bargain(response);
                        bargain.showListings();
                    } else {
                        System.out.println("Não foi possível obter a resposta da API. Verifique sua conexão coma a internet e tente novamente");
                    }
                    while (true){
                        System.out.println("Deseja continuar convertendo moedas? (S/N)");
                        String continuarOpcao = reader.readString();
                        if (continuarOpcao.equalsIgnoreCase("S")) {
                            System.out.println("\n-------------");
                            break;
                        } else if (continuarOpcao.equalsIgnoreCase("N")) {
                            continuar = false;
                            break;
                        } else {
                            System.out.println("Erro: Por favor, insira 'S' para continuar ou 'N' para sair.");
                        }

                    }
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: Ocorreu uma exceção NullPointerException. Verifique se todos os objetos foram inicializados corretamente.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor inserido não é um número válido. Certifique-se de digitar um valor numérico para a conversão.");
        } catch (Exception e) {
            System.out.println("Erro desconhecido " + e.getMessage());
        }
    }

    private static boolean isValidCurrencyCode(String code) {
        return validCurrencyCodes.contains(code.toUpperCase());
    }
}
