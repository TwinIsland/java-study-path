package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class chatbot{
    public static void main(String[] args) {
        ArrayList<String> familyResponse = new ArrayList<>();
        String[] questFamily = {"Who is your mom", "How old is your father", "Is your father handsome", "Do you love your father"};
        for (String i : questFamily) {
            familyResponse.add(i);
        }
        String[] randomResponse = {"How old are you", "Do you have a good day", "Do you want to be friend with me", "Father and mother, who you love more",
                "Do you like Wanyouxi", "Do you know Wyatt"};
        System.out.println("Hello, Let's chat");
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye")) {
            String content = getResponse(statement, familyResponse, randomResponse);
            if (content.equals("nothing")){
                System.out.print("Nothing to say");
                break;
            }
            System.out.println(content);
            statement = in.nextLine();
        }
        in.close();
    }

    public static String getResponse(String statement, ArrayList<String> fR, String[] rR) {
        String response = "ini";
        if (!aiSay(statement).equals("0"))
            return aiSay(statement);
        if (statement.contains("mother") || statement.contains("father") || statement.contains("sister") || statement.contains("brother")) {
            if (fR.size() == 0){
                return "nothing";
            } else {response = getFamilyResponse(fR);aiDelete(response,fR,rR);}
        } else {
            for (int i =0;i<rR.length;i++){
                String content = getRandomResponse(rR);
                aiDelete(content,fR,rR);
                if (!content.equals("nothing")) {
                    return content;
                }
            }
            return "nothing";
        }
        return response;
    }

    public static void aiDelete(String rp,ArrayList familyQuestion,String[] freeResponse){
        try{
            familyQuestion.remove(familyQuestion.indexOf(rp));}
        catch (IndexOutOfBoundsException e){
            int count = 0;
            for (String i:freeResponse){
                if (i == rp){
                    freeResponse[count] = "nothing";
                }
                count ++;
            }
        }
    }

    public static String getFamilyResponse(ArrayList<String> fR){
        int position = (int) (Math.random() * fR.size());
        return fR.get(position);
    }

    public static String getRandomResponse(String[]freeQuestion) {
        int position = (int) (Math.random() * 5);
        while (!freeQuestion[position].equals("nothing") )
            return freeQuestion[position];
        return "nothing";
    }

    public static String aiSay(String say){
        if (say.contains("I want to ")){
            return "I also want to " + say.substring(say.indexOf("want to "),say.length());
        }
        else if(say.contains("I love ")){
            return "What! You love " + say.substring(say.indexOf("love "),say.length()) + "?";
        }
        return "0";
    }
}