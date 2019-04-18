package classwork;

import java.util.Scanner;

public class judge {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("a:");
        int a = inp.nextInt();
        System.out.println("b:");
        int b = inp.nextInt();
        System.out.println("c:");
        int c = inp.nextInt();

        double omg = Math.pow(b,2) - 4 *a *c;
        double root = 2 * a;

        if (omg < 0) {
            System.out.println("No result in this function because" +
                    omg + " < 0");
        }
        else {
            double outp1 = (-b + omg)/root;
            double outp2 = (-b - omg)/root;
            System.out.println("the first answer: " + outp1 + "\n" +
            "the second answer: " + outp2);
        }
    }
}