package classwork;

public class search_para {

    private static void bubbleSort ( int[ ] elements) {
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
                }}}}

    private static void selectionSort ( int[ ] elements) {
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;

            for (int k = j + 1; k < elements.length; k++) {
                if  (elements[k] < elements[minIndex])
                {	minIndex = k;	}
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }}

    private static void insertionSort( int[] elements) {
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int maybe = j;
            while (maybe > 0 && temp < elements[maybe - 1])
            {	elements[maybe] = elements[maybe - 1];
                maybe--;
            }
            elements[maybe] = temp;
        }}

    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp) {
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

    public static int sequentialSearch(int[] elements, int target)
    {
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                return j;
            }
        }
        return - 1;
    }
    public static int binarySearch(int[] elements, int target)
    {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (target < elements[middle])
            {
                right = middle - 1;
            }
            else if (target > elements[middle])
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return - 1;
    }
}
