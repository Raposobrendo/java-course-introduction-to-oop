package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double p() {
        return (a + b + c) / 2.0;
    }

    public double area() {
        double p = p();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
