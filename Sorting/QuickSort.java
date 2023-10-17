public class QuickSort {

       public static void quickSort(int[] myArray, int low, int high) {
           if (low < high) {
               int pivotIndex = partition(myArray, low, high);
               quickSort(myArray, low, pivotIndex - 1);
               quickSort(myArray, pivotIndex + 1, high);
           }
       }

       public static int partition(int[] arr, int low, int high) {
           int pivot = arr[high];
           int i = low - 1;

           for (int j = low; j < high; j++) {
               if (arr[j] <= pivot) {
                   i++;
                   swap(arr, i, j);
               }
           }

           swap(arr, i + 1, high);
           return i + 1;
       }

       public static void swap(int[] arr, int i, int j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }

       public static void main(String[] args) {
           int[] arr = {18, 28, 2, 90, 7, 45};

           System.out.println("Array before sorting:");
           for (int num : arr) {
               System.out.print(num + " ");
           }

           quickSort(arr, 0, arr.length - 1);

           System.out.println("\nArray after sorting:");
           for (int num : arr) {
               System.out.print(num + " ");
           }
       }
}