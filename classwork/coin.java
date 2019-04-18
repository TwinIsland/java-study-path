package classwork;
import java.util.Scanner;

public class coin {
    public static void main(String args[]) {

        double price, price2;  //  pick a random price
        price = Math.random() * 10 + 40;
        price2 = Math.random() * 90 + 10;
        price2 = (int) price2;
        price2 = price2 / 100;
        price = (int) price + price2;

        System.out.println("the total money is: "); // show the money
        System.out.println(price);

        int a = 0; int b = 0;  // two useless value...

        while (a == 0) {  // repeat running if pay < price

            Scanner input_pay = new Scanner(System.in);    // let the user input the payment
            System.out.println("\ninput your payment below: ");
            double pay = input_pay.nextDouble();

            if (pay < price) {    // if the money is not enough

                b += 1;

                if(b<3) {

                    System.out.println("\nsorry...maybe your money is not enough");

                }else if(b < 5){
                    System.out.println("\nI mean you do not input enough money...");

                }else if(b<10){
                System.out.print("\ncan you hear me? you do not have enough money!!");

                }else{
                    a = 1;
                    System.out.println("\nOk, you win, i give up...");
                }

            } else if (pay == price) {    // if the money is equal to the payment

                a = 1;  // make the while break

                System.out.println("\nOK! it is a deal, you can go! ");

            } else {     // if the price is lower than the payment

                a = 1;  // make the while break

                double dollar, quarter, dime, nickel, penny;   // define all the type of money
                dollar = 1;
                quarter = 0.25;
                dime = 0.1;
                nickel = 0.05;
                penny = 0.01;

                double return_money = pay - price;  //the return money

                double num_doll = return_money / dollar;  //the number of dollar
                num_doll = (int) num_doll;
                return_money = return_money - num_doll * dollar;   // rest money

                double num_quart = return_money / quarter;  //the number of quarter
                num_quart = (int) num_quart;
                return_money = return_money - num_quart * quarter;

                double num_dim = return_money / dime;  //the number of dime
                num_dim = (int) num_dim;
                return_money = return_money - num_dim * dime;

                double num_nic = return_money / nickel;  //the number of nickle
                num_nic = (int) num_nic;
                return_money = return_money - num_nic * nickel;

                double num_pen = return_money / penny;  //the number of penny
                num_pen = (int) num_pen;

                if(num_doll > 20) {
                    System.out.println("Rich people huh...");
                }

                System.out.println("\n*****Check*****");
                System.out.println("\nDollar: ");  // print the result
                System.out.println(num_doll);
                System.out.println("\nQuarter: ");
                System.out.println(num_quart);
                System.out.println("\ndime: ");
                System.out.println(num_dim);
                System.out.println("\nnickle: ");
                System.out.println(num_nic);
                System.out.println("\npenny: ");
                System.out.println(num_pen);
                System.out.println("\n***************");
            }
        }
    }
}