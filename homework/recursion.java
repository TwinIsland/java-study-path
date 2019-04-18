// code by Wyatt
// recursion lab include extra question

package homework;

public class recursion {

    private static int sum(int end) { //question1
        int sum = end;
        if (end > 0) {
            sum = sum + sum(end - 1);
        }
        return sum;
    }

    private static int sum2(int began, int end) {  //question2
        int sum = began;
        if (began < end) {
            sum = sum + sum2(began + 1, end);
        }
        return sum;
    }

    private static int hailstone(int number,int ini,int[] mem) { //question34
        int sum = ini;
        if (0 == number % 2 & number != 1) {
            System.out.println(number);
            sum = sum + hailstone(number / 2,ini,mem);
            mem[sum-1] = number;
        } else if (number != 1){
            System.out.println(number);
            sum = sum + hailstone(3 * number + 1,ini,mem);
            mem[sum-1] = number;
        } else {
            System.out.println(1);
        }
        return sum;
    }

    private static int[] gain_hailstone_array(int number, int[]trash_container){

        //INPUT DECLARE:  Just change the first parameter which represent initial hailstone number
        int element_number = hailstone(number,1,trash_container);
        // Define the array memory
        int[] mem = new int [element_number];
        //memorize it
        hailstone(number,1,mem);
        mem[0] = 1; // add the first element
        return mem;
        //OUTPUT DECLARE:  hailstone number in array form
    }

    private static int[] extra_question_1and2(int[]hailstone_array){
        int len = 0; int temp;//define the length variable
        temp = hailstone_array[0];
        for (int i:hailstone_array){
            if (temp < i)
                temp = i;
            len ++;
        }
        for (int i:hailstone_array)
            System.out.print(i + " ");
        int[]result = {len,temp};
        return result; //  OUTPUT DECLARE: length of the array and max number in array
    }

    private static int[] extra_question_3and4(int[]trash_container){
        int [] len_array = new int[1000]; // initialize two array for memorzing
        int [] max_numb = new int [1000];
        int [] result = new int [2];
        for (int i = 1;i< 1000;i ++){
            len_array [i] = extra_question_1and2(gain_hailstone_array(i,trash_container))[0];
            max_numb [i] = extra_question_1and2(gain_hailstone_array(i,trash_container))[1];
        }
        int temp = len_array[0]; // for comparing
        for (int i:len_array){
            if (temp < i)
                temp = i;
        }
        result[0] = temp;
        temp = max_numb[0];
        for (int i:max_numb){
            if (temp < i)
                temp = i;
        }
        result[1] = temp;
        return result;  //  OUTPUT DECLARE: Max length and Max number
    }

    public static void main(String args[]) {
        // trash container
        int[] trash_container = new int [1000000]; // Without this line, the program will in error

        // gain the array format
        int [] hailstone_array = gain_hailstone_array(10,trash_container);

        // solve the answer
        int[] answer1 = extra_question_1and2(hailstone_array);
        int[] answer2 = extra_question_3and4(trash_container);

        //print out the answer
        System.out.println();
        System.out.println("\n==========================================================");
        System.out.print("\nhailstone array: ");
        for (int i:hailstone_array)
            System.out.print(i + " ");
        System.out.println("\nhailstone elements: " + answer1[0]);
        System.out.println("hailstone max number among element: " + answer1[1]);
        System.out.println("Max length among 1000 hailstones: " + answer2[0]);
        System.out.println("Max element value among 1000 hailstone: " + answer2[1]);
        System.out.println("\n==========================================================");
    }
}