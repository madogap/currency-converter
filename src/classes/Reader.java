package classes;

import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public Reader(){
        this.scanner = new Scanner(System.in);
    }


    public String readString(){
        return scanner.nextLine().strip().toUpperCase();

    }

    public double readDouble(){
        while (true){
            String input = scanner.nextLine().strip();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e){
                System.out.println("Error: Valor inválido. Por favor, insira um valor númerico");
            }
        }

    }

    public Boolean simNao(){
        try {
            String input = readString();
            return input.startsWith("S") || input.startsWith("Y");
        } catch (Exception e){
            System.out.println("Error: " +e.getMessage());
            return false;
        }
    }

    public void close() {
        scanner.close();
    }
}
