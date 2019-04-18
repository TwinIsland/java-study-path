package homework;


import java.util.ArrayList;

public class test {
    public static void main(String args[]) {
        ArrayList<String> x = new ArrayList<String>(10);
        x.add("a");
        x.add("b");
        x.add("c");
        int[] y =  {1,2,3,4,5};
        x.remove(2);
        System.out.print(x);
        System.out.print(y);
    }
}
