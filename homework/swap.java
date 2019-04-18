package homework;

public class swap {

    public static void swap1(int first_letter,int second_letter){
        int c = first_letter;

    }
    public static void swap2(int[] array){
        int[] array2 = new int [array.length];
        int l = array.length - 1;
        for(int ii:array) {
            array[l] = 0;
            l -= 1;
        }

    }
    public static void main(String args[]) {
        int[] test_array = {1,2,3,4};
        int a = 2;int b = 9;
        // called in main function
        System.out.println("\n=====  main call  =====\n");
        System.out.println("first letter: " + a);
        System.out.println("second letter:"+ b);
        //called in function
        System.out.println("\n=====function call=====\n");
        swap1(a,b);
        System.out.println("first letter: " + a);
        System.out.println("second letter:"+ b);

        System.out.println("\n===== swamp array =====\n");
        swap2(test_array);
        System.out.println(test_array[0]);
        System.out.println(test_array[1]);

    }
}