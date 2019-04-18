package classwork.ooj;

import java.lang.reflect.Array;

public class test2 {
    private static int[] insertionSort(int[] aa, int length) {
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j>0;j--){
                if(aa[j]<aa[j-1]){
                    int temp = aa[j-1];
                    aa[j-1]=aa[j];
                    aa[j]= temp;
                }
            }
        }
        return aa;
    }

    public static void main(String[] args) {
        int aa[] ={5,3,4,1,19,1,2,7,1};
        aa = insertionSort(aa,aa.length);
        for(int i:aa){
            System.out.print(i);
        }

        deck a = new deck();
        ((hand)a).sortByNumber();
    }
}
