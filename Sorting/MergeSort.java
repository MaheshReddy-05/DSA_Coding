public class MergeSort {

      //Merge Sort array
      public static void mergeSort(int[] myArray) {
        if (myArray.length <= 1) {
            return;
        }

        int mid = myArray.length / 2;
        int[] left = new int[mid];
        int[] right = new int[myArray.length - mid];

        System.arraycopy(myArray, 0, left, 0, mid);
        System.arraycopy(myArray, mid, right, 0, myArray.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(myArray, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // index for left subarray
        int j = 0; // index for right subarray
        int k = 0; // index for merged array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {18, 2, 28, 7, 90, 45};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr);

        System.out.println("\nArray after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}