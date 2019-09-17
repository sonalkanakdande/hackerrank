package InsertionSort;

public class InsertionSortRecursive {

    void sort(int arr[]) {

        int len = arr.length;
        for (int i = 1; i < len ; i++){
            int key = arr [i];
            int j = i-1;
            while (j >=0 && arr [j] >key){
                arr [j+1] = arr [j];
                j-=1;
            }

            arr[j+1] = key;
        }


    }
        /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSortRecursive ob = new InsertionSortRecursive();
        ob.sort(arr);

        printArray(arr);
    }
}
