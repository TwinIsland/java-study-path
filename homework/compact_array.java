package homework;

public class compact_array {
    public static void main(String args[]) {
        int num = 20;
        int[] data = new int[num];int count = 0;int[] non_zero = new int[num];int count3 = 0;int count2 = 0;int count4 = 0;
        while (count < (num - 1)) {
            count++;
            data[count] = (int) (Math.random() * 10);
        }   //question 1
        for (int a : data)
            System.out.print(a);
        System.out.print("\n");
        while (count2 < num) {  // question 2
            if (data[count2] != 0) {
                non_zero[count3] = data[count2];
                count3++;
            }
            count2++;
        }
        for (int a : non_zero)
            System.out.print(a);
        System.out.print("\n");
        for (int a : data) {
            if (a == 0) {
                for (int b = (count4); b < data.length-1; b++) {
                    data[b] = data[b + 1];
                }
            }
            count4++;
        }
        count4 = 0;
        for (int a : data) {
            if (count4 > (count3-1)) { break; }
            System.out.print(a);
            count4++;
        }
    }
}