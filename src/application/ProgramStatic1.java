package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStatic1 {

    public static final double PI = 3.14159;

    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of a circle: ");

        Calculator.radius = sc.nextDouble();

        System.out.printf("Circunference: %.2f\n", Calculator.circunference());
        System.out.printf("Volume: %.2f\n", Calculator.volume());
        System.out.printf("PI: %.2f\n", Calculator.PI);


        sc.close();
    }
}
