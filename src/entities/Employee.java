package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public double increaseSalary(double increase){
        grossSalary *= 1+(increase/100);
        return grossSalary;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
