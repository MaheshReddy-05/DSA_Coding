public class InsertionSort {
    public static void insertionSort(int[] myArray) {
        int n = myArray.length;

        for (int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j--;
            }

            myArray[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {18, 90, 7, 28, 45, 2};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nArray after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}