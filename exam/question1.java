package exam;

import java.util.ArrayList;

public class question1 {
    public static void main(String args[]) {

        System.out.println(new Digits(12439).isStrictlyIncreasing());
    }
}


class Digits{

    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<Integer>();

        if (num == 0){
            digitList.add(0);
        }

        else {
            while (num > 0) {
                digitList.add(num % 10);
                num /= 10;

            }
        }
    }

    void printIt(){
        for(int i:this.digitList){
            System.out.print(i + ",");
        }
    }

    Boolean isStrictlyIncreasing(){
        for(int i=0;i<this.digitList.size()-1;i++){
            if (this.digitList.get(i) < this.digitList.get(i + 1))
                return false;
        }
        return true;
    }
}
