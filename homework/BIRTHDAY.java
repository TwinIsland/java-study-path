package homework;


import java.util.Scanner;
import java.util.SortedSet;

public class BIRTHDAY{
    public static void main(String args[]) {
        try {
            // ask for birthday
            Scanner in = new Scanner(System.in);
            System.out.println("Birthday\neg:20180911\nYour birthday:");
            int birthday = in.nextInt();
            String birthday_tran = String.valueOf(birthday);
            // Split values
            String birth_year = birthday_tran.substring(0, 4);
            String birth_mon = birthday_tran.substring(4, 6);
            String birth_day = birthday_tran.substring(6);

            //Chinese zodiac
            //get the id number of zodiac, and transfer all the values' format
            int year = Integer.parseInt(birth_year);
            int mon = Integer.parseInt(birth_mon);
            int day = Integer.parseInt(birth_day);
            int id_chinese = (year) % 12 - 3;
            // According to ID to judge ShengXiao
            if (mon >= 0 && mon <= 12 && 0 <= day && day <= 31) {
                System.out.println("=======================");
                System.out.println("\nFor Chinese ShenXiao");
                switch (id_chinese) {

                    case 1:
                        System.out.println("MOUSE YEAR");
                        break;
                    case 2:
                        System.out.println("BEEF YEAR");
                        break;
                    case 3:
                        System.out.println("TIGER YEAR");
                        break;
                    case 4:
                        System.out.println("RABBIT YEAR");
                        break;
                    case 5:
                        System.out.println("DRAGON YEAR");
                        break;
                    case 6:
                        System.out.println("SNAKE YEAR");
                        break;
                    case 7:
                        System.out.println("HOUSE YEAR");
                        break;
                    case 8:
                        System.out.println("SHEEP YEAR");
                        break;
                    case 9:
                        System.out.println("MONKEY YEAR");
                        break;
                    case 10:
                        System.out.println("CHICKEN YEAR");
                        break;
                    case 11:
                        System.out.println("DOG YEAR");
                        break;
                    case 0:
                        System.out.println("PIG YEAR");
                        break;
                    default:
                        System.out.println("Ops..This program goes wrong");
                        break;
                }
                // for western
                System.out.println("\nFor Western country: ");
                if ((mon == 2 && day < 18) || (mon == 1 && day > 20))
                    System.out.println("Aquarius");
                if ((mon == 3 && day < 20) || (mon == 2 && day > 19))
                    System.out.println("Pisces");
                if ((mon == 4 && day < 19) || (mon == 3 && day > 21))
                    System.out.println("Aries");
                if ((mon == 5 && day < 20) || (mon == 4 && day > 20))
                    System.out.println("Taurus");
                if ((mon == 6 && day < 21) || (mon == 5 && day > 21))
                    System.out.println("Gemini");
                if ((mon == 7 && day < 22) || (mon == 6 && day > 22))
                    System.out.println("Cancer");
                if ((mon == 8 && day < 22) || (mon == 7 && day > 22))
                    System.out.println("Leo");
                if ((mon == 9 && day < 22) || (mon == 8 && day > 23))
                    System.out.println("virgo");
                if ((mon == 10 && day < 23) || (mon == 9 && day > 23))
                    System.out.println("Libra");
                if ((mon == 11 && day < 21) || (mon == 10 && day > 24))
                    System.out.println("Scorpio");
                if ((mon == 1 && day < 20) || (mon == 11 && day > 21) || (mon == 12))
                    System.out.println("Sagittarius");
                System.out.println("\n=======================");
            }
            // if user write a wrong birthday
            else {
                System.out.println("Your birthday is strange..");
            }
            // if input a wrong birthday
        } catch (java.util.InputMismatchException e) {
            System.out.println("Your birthday is strange");
        }
        }
    }