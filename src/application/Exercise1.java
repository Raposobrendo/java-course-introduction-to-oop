package application;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] Args){
        exercise3();
    }

    public static void exercise1(){
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

        sc.close();
    }

    public static void exercise2(){
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Input name, salary and tax of an employee: ");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);
        System.out.println("Updated Data: " + employee);

        sc.close();
    }

    public static void exercise3(){
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter your name and your 3 grades: (maximum 100 per grade)");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("Final grade: " + student.medium());
        System.out.println(student.pass());


        sc.close();
    }
}
