public class SelectionSort {
   public static void selectionSort(int[] myArray) {
       int n = myArray.length;
       for (int i = 0; i < n - 1; i++) {
           int minIndex = i;
           // Find the index of the minimum element in the unsorted part of the array
           for (int j = i + 1; j < n; j++) {
               if (myArray[j] < myArray[minIndex]) {
                   minIndex = j;
               }
           }
           // Swap the minimum element with the first element of the unsorted part
           int temp = myArray[minIndex];
           myArray[minIndex] = myArray[i];
           myArray[i] = temp;
       }
   }
   public static void main(String[] args) {
       int[] arr = {18, 28, 45, 2, 90, 7};
       System.out.println("Array before sorting:");
       for (int num : arr) {
           System.out.print(num + " ");
       }
       selectionSort(arr);
       System.out.println("\nArray after sorting:");
       for (int num : arr) {
           System.out.print(num + " ");
       }
   }
}