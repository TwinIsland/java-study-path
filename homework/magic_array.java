package homework;

public class magic_array {
    public static void main(String args[]) {

        int element_number = 10;  //define the N*N there

        // create magic square
        int sum = 0;int sum_ini = 0;
        int[][] data = new int[element_number][element_number];
        System.out.println("===========================");
        System.out.println("Square example:\n");
        for (int i = 0; i < element_number; i++) {
            for (int ii = 0; ii < element_number; ii++) {
                data[i][ii] = (int) (Math.random() * (Math.pow(element_number, 2))) + 1;
                System.out.print(data[i][ii] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("===========================");
        while (true) {
            int result = 1;
            int[] trans = new int[(int) Math.pow(element_number, 2)]; // create a random 2D array
            for (int i = 0; i < element_number; i++) {
                for (int ii = 0; ii < element_number; ii++) {
                    data[i][ii] = (int) (Math.random() * (Math.pow(element_number, 2))) + 1;
                    trans[i * element_number + ii] = data[i][ii];
                }
            }
            int count = 0;int count2 = 0; // find if there are repeat element
            for (int i:trans){
                count ++;count2 = 0;
                for(int ii:trans){
                    count2 ++;
                    if (ii == i && count != count2){
                        result = 0;
                        break;
                    }
                }
            }
            if (result != 1) {
                continue;
            }
            sum_ini = 0;
            for (int i=0;i<element_number;i++){ // find the sample sum
                sum_ini = sum_ini + data[i][i];
            }
            for (int ver=0;ver<element_number;ver++){  //horizontal check
                sum = 0;
                for (int hor=0;hor<element_number;hor++){
                    sum = sum + data[ver][hor];
                }
                if (sum_ini != sum){result = 0;break;}
            }
            if (result != 1) {
                continue;
            }
            //find the number inside is not repeat
            for (int hor=0;hor<element_number;hor++){  // vertical check
                sum = 0;
                for (int ver=0;ver<element_number;ver++){
                    sum = sum + data[ver][hor];
                }
                if (sum_ini != sum){result = 0;break;} // result is equal to 0 means it cannot be, continue the loop
            }
            if (result != 1) {
                continue;
            }
            sum = 0;
            for (int a = element_number-1; a >= 0;a--){
                sum = sum + data[a][a];
            }
            if (sum_ini == sum){
                System.out.println("Magic Square:\n");
                for (int i = 0; i < element_number; i++) {
                    for (int ii = 0; ii < element_number; ii++) {
                        System.out.print(data[i][ii] + " ");
                    }
                    System.out.println("\n");
                }
                System.out.print("===========================");
                break;
            }
        }
    }
}