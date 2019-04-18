package homework;

import java.util.Scanner;

public class str_h {
    public static void main(String args[]) {
        System.out.println("\n----------------------");

        String word = "My name is wyatt";
        System.out.println("\nRaw word:");
        System.out.println(word);
        String word_b = word;
        int len = word.length();

        // backward
        String upw = "";
        for (int i = len; i > 0; i--) {
            upw = upw + word.substring(i - 1, i);
        }
        System.out.println("\nBackward word: ");
        System.out.println(upw);

        //vowel number solve
        int vowl = 0;
        while (true) {
            int count = 0;

            int vowl_l = word.indexOf("a");
            if (vowl_l == -1) {
                count++;
            } else {
                vowl++;
                int find = word.indexOf("a");
                word = word.substring(0, find) + "&" + word.substring(find + 1, word.length());
            }

            vowl_l = word.indexOf("e");
            if (vowl_l == -1) {
                count++;
            } else {
                vowl++;
                int find = word.indexOf("e");
                word = word.substring(0, find) + "&" + word.substring(find + 1, word.length());
            }

            vowl_l = word.indexOf("i");
            if (vowl_l == -1) {
                count++;
            } else {
                vowl++;
                int find = word.indexOf("i");
                word = word.substring(1, find) + "&" + word.substring(find + 1, word.length());
            }

            vowl_l = word.indexOf("o");
            if (vowl_l == -1) {
                count++;
            } else {
                vowl++;
                int find = word.indexOf("o");
                word = word.substring(1, find) + "&" + word.substring(find + 1, word.length());
            }

            vowl_l = word.indexOf("u");
            if (vowl_l == -1) {
                count++;
            } else {
                vowl++;
                int find = word.indexOf("u");
                word = word.substring(1, find) + "&" + word.substring(find + 1, word.length());
            }

            if (count == 5)
                break;

        }
        System.out.println("\nVowel number: ");
        System.out.println(vowl);

        //question 3
        word = word_b;
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