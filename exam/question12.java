package exam;

public class question12 {

    public static void main(String[] args) {

        StudyPractice a = new StudyPractice();

        System.out.println(a.getProblem());

        a.nextProblem();
        System.out.println(a.getProblem());
    }
}

interface studyPractice{

    String getProblem();
    void nextProblem();

}

class StudyPractice implements studyPractice{

    private int number_1 = (int)((Math.random()+1)*10);
    private int number_2 = (int)((Math.random()+1)*10);

    public String getProblem(){
        return number_1 + " Times " + number_2;
    }

    public void nextProblem(){
        this.number_1 = (int)((Math.random()+1)*10);
        this.number_2 = (int)((Math.random()+1)*10);
    }
}