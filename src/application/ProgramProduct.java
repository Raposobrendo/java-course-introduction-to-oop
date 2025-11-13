package application;

import entities.Product;

import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.printf("Product data: " + product);
        System.out.print("Enter the number of products to enter the stock: ");
        int quantityChange = sc.nextInt();
        product.addProduct(quantityChange);
        System.out.printf("Updated data: " + product);
        System.out.print("Enter the number of products to enter the stock: ");
        quantityChange = sc.nextInt();
        product.removeProduct(quantityChange);
        System.out.printf("Updated data: " + product);


        sc.close();
    }
}
