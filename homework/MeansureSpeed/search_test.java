package homework.MeansureSpeed;

public class search_test {

    public static void main(String args[]) {
        int[]test=create_random_array(70000);
        System.out.print(sequentialSearch(test,1));
    }

    // define all the algorithm
    private static double bubbleSort ( int[ ] elements) {
        double a1 = timer();
        int J = 0;	int temp;	boolean swapped = true;
        while (swapped) {


            swapped = false;
            J++;
            for (int k = 0; k < elements.length-J; k++) {
                if ( elements[k] > elements[k+1] ) {
                    temp = elements[k];
                    elements[k] = elements[k+1];
                    elements[k+1] = temp;
                    swapped = true;
                }
            }
        }
        double a2 = timer();
        return (a2-a1);
    }

    private static double selectionSort ( int[ ] elements) {
        double a1 = timer();
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;

            for (int k = j + 1; k < elements.length; k++) {
                if  (elements[k] < elements[minIndex])
                {	minIndex = k;	}
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }double a2 = timer();return (a2-a1);}

    private static double insertionSort( int[] elements) {
        double a1 = timer();
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int maybe = j;
            while (maybe > 0 && temp < elements[maybe - 1])
            {	elements[maybe] = elements[maybe - 1];
                maybe--;
            }
            elements[maybe] = temp;
        }double a2 = timer();return (a2-a1);}

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static double mergeSort(int[] elements) {
        double a1 = timer();
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
        double a2 = timer();return (a2-a1);
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
            if (elements[i] < elements[j]) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }

    private static double sequentialSearch(int[] elements, int target) {
        double a1 = timer();
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                return j;
            }
        }
        double a2 =timer();
        return (a2-a1);
    }

    private static double timer(){
        return System.currentTimeMillis();
    } //timer

    private static int[] create_random_array(int parameter_number){
        int[] temp = new int [parameter_number];
        for (int i = 0;i<parameter_number-1;i++){
            temp[i] = (int)(Math.random()*10);
        }
        return temp;
    } //create array function

}