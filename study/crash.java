package study;

import java.util.Scanner;
public class crash {
    public static void main(String args[]) {
        int a = 0;
        while(a<10){
            a ++;
            if (a == 5)
                continue;
            System.out.println(a);

        }
    }
}