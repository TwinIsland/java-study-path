package classwork;

public class class2 {
    public static int getavg(int[] a){
        int sum = 0;
        for (int i:a){
            sum = sum + i;
        }

        return sum/a.length;
    }


    public static int vowl(String v){
        int vowl[] = {'a','e','i','o','u'};
        int count = 0;
        for (int i =0;i < v.length();i =+ 1){
            for (int ii:vowl){
                if (ii == i)
                    count ++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int [] a = {1,2,3,4};
        System.out.print(getavg(a));

    }


}
