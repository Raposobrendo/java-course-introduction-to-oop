package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double medium(){
        return (grade1*0.3) + (grade2*0.35) + (grade3*0.35);
    }

    public String pass(){
        if(medium() >= 60){
            return "Pass";
        }else{
            return "Failed\nMissing " + (60-medium()) + " points";
        }
    }
}
