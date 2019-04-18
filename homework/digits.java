package homework;

import java.util.Scanner;

public class digits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Input here:");
        int inp = in.nextInt();
        int inp2 = inp;
        try {
            while (Math.abs(inp) > 0) {
                inp = inp / 10;
                count = count + 1;
            }
            System.out.println("\n--------------------------");
            System.out.println("Digit number: \n" + count);

            // biggest one
            String temp;
            int o;
            int big = 0;
            String inp_t = String.valueOf(inp2);
            for (o = 0; o < inp_t.length(); o++) {
                temp = inp_t.substring(o, o + 1);
                if (Integer.parseInt(temp) > big) {
                    big = Integer.parseInt(temp);
                }
            }
            System.out.println("\nBiggest digit:");
            System.out.println(big);
            System.out.println("--------------------------");
        }catch (java.lang.NumberFormatException e) {
            System.out.println("\nNumber cannot be negative");
        }
    }
}