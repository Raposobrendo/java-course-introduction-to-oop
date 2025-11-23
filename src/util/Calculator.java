package util;

public class Calculator {
    public static final double PI = 3.14159;
    public static double radius;
    public static double circunference(){
        return 2 * PI * radius;
    }
    public static double volume(){
        return 4 * PI * radius * radius * radius / 3;
    }

}
