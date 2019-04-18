package homework;

public class function_lab {

    public static int pythagorean(int a,int b){
        return (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public static void print_it(){
        System.out.println("----------");
    }

    public static boolean check_even(int a){
        return a % 2 == 0;
    }

    public static int add_array(int[] a){
        int sum = 0;
        for (int i:a)
            sum += i;
        return sum;
    }

    public static void spell_back(String a){
        for (int i = a.length(); i > 0 ; i --){
            System.out.print(a.substring(i-1,i));
        }
    }

    public static Boolean check_odd(int a){
        return !check_even(a);
    }

    public static void main(String args[]) {
        int[]a = {1,2,3,4};
        System.out.print(add_array(a));
    }
}
