//Given an array a[] of size N which contains elements from 0 to N-1, you need to find 
//all the elements occurring more than once in the given array.

public class FindDuplicates {
    static void findDups(int[] arr, int n) {
        // Check all the values while traversing in an array
        // Go to that value as indexes and increment by size of array
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Check which values exists more than one by dividing with size of array
        for (int i = 0; i < n; i++) {
            if (arr[i] / n > 1) {
                System.out.println(i + "");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 0, 8, 8, 8};
        int size = arr.length;
        System.out.println("Duplicate Elements are: ");
        findDups(arr, size);
    }
}