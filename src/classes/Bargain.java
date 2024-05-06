package classes;

import api.ResponseApi;

public class Bargain {
    private String currency1, currency2, rate, result, last_update;
    private double finalValue;

    public Bargain(String currency1, String currency2, String rate, String result, String last_update, double finalValue) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.rate = rate;
        this.result = result;
        this.last_update = last_update;
        this.finalValue = finalValue;
    }

    public Bargain(ResponseApi response) {
        if (response == null){
            throw new IllegalArgumentException("Erro: O objeto ResponseApi não pode ser nulo.");
        }
        this.currency1 = response.baseCode();
        this.currency2 = response.targetCode();
        this.rate = String.valueOf(response.conversionRate());
        this.result = response.result();
        this.last_update = response.timeLastUpdateUtc();
        this.finalValue = response.finalValue();
    }

    public void showListings() {
        System.out.println("Resultado da conversão:");
        System.out.println("----------------------");
         System.out.println("Taxa de conversão: " + rate);
         System.out.println("Resultado da conversão: " + finalValue);
         System.out.println("----------------------");
         System.out.println("Última atualização do câmbio: " + last_update);
    }

    public String getCurrency1() {
        return currency1;
    }

    public String getLast_update() {
        return last_update;
    }

    public String getResult() {
        return result;
    }

    public String getRate() {
        return rate;
    }

    public String getCurrency2() {
        return currency2;
    }
}

