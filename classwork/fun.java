package classwork;

public class fun {
    public static int getMin(int x, int y) {
        int answer;
        if (x < y)
            answer = x;
        else
            answer = y;
        return answer;
    }

    public static void main(String args[]) {
        System.out.print(getMin(1,2));
    }

}
