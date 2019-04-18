package exam;


public class question4 {


    public static void main(String args[]) {
        Position test = new Position();

        int[][] testArray = {{1,2,3,4},{5,6,7,8}};

        int[] answer = test.findPosition(8,testArray);

        if (answer[0] == -1){
            System.out.print("No element find!");
        }

        else {
            System.out.println("Find the Position: ");
            System.out.print(answer[0] + ",");
            System.out.print(answer[1]);
        }
    }
}

class Position{

    public int[] findPosition(int find_number, int[][] int_Array){

        int col = int_Array.length;
        int raw = int_Array[0].length;

        for (int col_now = 0; col_now < col; col_now ++){

            for (int raw_now = 0; raw_now < raw; raw_now ++) {

                if(int_Array[col_now][raw_now] == find_number) {
                    int[] answer = {col_now,raw_now};
                    return answer;
                }
            }
        }
        int[] answer = {-1,-1};
        return answer;
    }
}

