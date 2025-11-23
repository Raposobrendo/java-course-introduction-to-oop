package application;

import util.CurrencyConverter;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the price of Dolar? ");
        double price = sc.nextDouble();
        System.out.print("How many Dollars will be bought? ");
        double quantity = sc.nextDouble();
        double total = CurrencyConverter.converter(price, quantity);

        System.out.printf("Amount to be paid in reais: %.2f", total);

        sc.close();
    }
}
