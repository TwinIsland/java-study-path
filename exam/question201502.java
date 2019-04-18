package exam;

public class question201502 {
    public static void main(String[] args) {

        puzzle a = new puzzle();
        a.HiddenWord("Hello");

        System.out.print(a.getHint("hallo"));
    }
}


class puzzle{

    private String word;

    public void HiddenWord(String puzzle){
        word = puzzle;
    }

    public String getHint(String guess){

        for (int i=0;i< guess.length();i++){

            if (!word.contains(guess.substring(i,i+1))) {
                guess = guess.substring(0, i) + "*" + guess.substring(i + 1, guess.length());
            }

            else if(word.contains(guess.substring(i,i+1)) & !guess.substring(i,i+1).equals(word.substring(i,i+1)))
                guess = guess.substring(0, i) + "+" + guess.substring(i + 1,guess.length());
        }

        return guess;
    }


}