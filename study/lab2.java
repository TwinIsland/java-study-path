package study;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String aa = a;
        int x = a.length();
        int COUNT = 0;
        int z = 1;
        for (int y = x; y >= 1; y--) {
            String R = a.substring(y - 1, y);
            System.out.print(R);
            if (R.compareTo("a") == 0 || R.compareTo("e") == 0 || R.compareTo("i") == 0 || R.compareTo("o") == 0 || R.compareTo("u") == 0)
                COUNT++;
        }
        System.out.println(" VOWELS=" + COUNT);

        String word = aa;
        int len;
        String rand_w = "";
        int count = 0;
        String ran = "";
        int slen = word.length();
        while (count < slen){
            len = word.length();
            int seed = (int) (Math.random()*(len));
            rand_w = word.substring(seed,seed + 1);
            ran = ran + rand_w;
            word = word.substring(0,seed) + word.substring(seed + 1,len);
            count ++;
        }
        System.out.println("\nRandom pick: ");
        System.out.println(ran);
        System.out.println("\n----------------------");
    }
}