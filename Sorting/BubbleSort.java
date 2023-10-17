public class BubbleSort {

       public static void bubbleSort(int[] myArray) {
           int n = myArray.length;
           for (int i = 0; i < n - 1; i++) {
               for (int j = 0; j < n - i - 1; j++) {
                   if (myArray[j] > myArray[j + 1]) {
                       int temp = myArray[j];
                       myArray[j] = myArray[j + 1];
                       myArray[j + 1] = temp;
                   }
               }
           }
       }
       public static void main(String[] args) {
           int[] arr = {18, 28, 2, 7, 90, 45};

           System.out.println("Array before sorting:");
           for (int num : arr) {
               System.out.print(num + " ");
           }
           bubbleSort(arr);
           System.out.println("\nArray after sorting:");
           for (int num : arr) {
               System.out.print(num + " ");
           }
       }
}