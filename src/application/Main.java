package application;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xa, xb, xc, ya, yb, yc, xarea, yarea, xp, yp;

        System.out.println("Enter the measures of triangle X: ");
        xa = sc.nextInt();
        xb = sc.nextInt();
        xc = sc.nextInt();
        xp = (xa + xb + xc)/2;
        xarea = Math.sqrt(xp*(xp-xa)*(xp-xb)*(xp-xc));
        System.out.println("Enter the measures of triangle Y: ");
        ya = sc.nextInt();
        yb = sc.nextInt();
        yc = sc.nextInt();
        yp = (ya + yb + yc)/2;
        yarea = Math.sqrt(yp*(yp-ya)*(yp-yb)*(yp-yc));

        System.out.println("Triangle X area: " + xarea);
        System.out.println("Triangle Y area: " + yarea);
        if(xarea > yarea){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}