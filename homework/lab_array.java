package homework;

public class lab_array {
    public static void main(String args[]) {
        double mean = 0;double sum = 0;int count = 0;String mode = "0";int big = 0;
        int[] a = {1,1,2,2,3,4,4,5,3};int small = a[0];int big2 = a[0];//array definition there
        while (count < a.length) {
            mean = a[count] + mean;
            count ++;
        }
        System.out.println("The mean is equal to: "+ mean/(a.length));
        // standard deviation
        while (count > 0){
            count --;
            sum = Math.pow((mean - a[count]),2) + sum;
        }
        double sd = Math.sqrt(sum/(a.length - 1));
        System.out.println("The standard deviation is equal to: " + sd);
        // find the mode
        while (count < a.length -1) {
            int comp = 0;
            count ++;
            for (int element:a) {
                if (count == element) {comp++;}
            }
            mode = (mode + comp);
        }
        while (count > 1){
            count --;
            if (Integer.parseInt(mode.substring(count-1,count)) > big) {
                big = Integer.parseInt(mode.substring(count-1,count));
            }
        }
        int position = mode.indexOf(String.valueOf(big));
        System.out.println("The mode in this array is: " + a[position] + ", and this number appears " + big + " times");
        // max and min
        count = a.length;
        while(count > 0){
            count --;
            if (a[count] > big2){
                big2 = a[count];
            };
            if (a[count] < small) {
                small = a[count];
            }
        }
        System.out.println("Max value is: " + big2 + "\n" +
                           "Min value is: " + small);
    }
}