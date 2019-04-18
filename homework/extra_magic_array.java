package homework;

import java.util.Scanner;

public class extra_magic_array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your square element below(must be odd): ");
        int element = in.nextInt();

        if (element % 2 != 0) {
            //initialize
            int[][] data = new int[element][element];
            data[0][(element + 1) / 2 - 1] = 1;
            int r = 0;
            int c = (element + 1) / 2 - 1;
            //began
            for (int a = 2; a <= (int) Math.pow(element, 2); a++) {
                try {
                    if (data[r - 1][c + 1] == 0) {
                        data[r - 1][c + 1] = a;
                        r = r - 1;
                        c = c + 1;
                    } else {
                        data[r + 1][c] = a;
                        r = r + 1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (r == 0) {
                        try {
                            if (data[element - 1][c + 1] == 0) {
                                data[element - 1][c + 1] = a;
                                r = element - 1;
                                c += 1;
                            } else {
                                data[r + 1][c] = a;
                                r += 1;
                            }
                        } catch (ArrayIndexOutOfBoundsException e1) {
                            if (data[element - 2][0] == 0) {
                                data[element - 2][0] = a;
                                r -= 1;
                                c = 0;
                            } else {
                                data[r + 1][c] = a;
                                r += 1;
                            }
                        }
                    } else {
                        data[r - 1][0] = a;
                        r -= 1;
                        c = 0;
                    }
                }
            }
            System.out.println("\nMagic Square:\n");
            for (int i = 0; i < element; i++) {
                for (int ii = 0; ii < element; ii++) {
                    System.out.print(data[i][ii] + " ");
                }
                System.out.println("\n");
            }
        }else{
            System.out.print("\nN must be odd number");

        }
    }
}

