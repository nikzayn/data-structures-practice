public class RemoveDuplicates {
    // Naive Solution
    // Time Complexity - Theta(n)
    // Space Complexity - Theta(n)

    // static int removeDupsNaive(int arr[], int n) {
    // // Create a temporary array
    // int temp[n];
    // // Assign the first variable to the arr first variable
    // temp[0] = arr[0];
    // int res = 1;
    // // Traverse over array and find the distinct value from previous to next
    // for(int i = 1; i < n; i++){
    // if(temp[res - 1] != arr[i]){
    // temp[res] = arr[i];
    // res++;
    // }
    // }

    // for(int i = 0; i < res; i++){
    // arr[i] = temp[i];
    // }
    // return res;
    // }

    // Efficient Solution
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int removeDupsEff(int arr[], int n) {
        // Initialize a variable with value 1
        int res = 1;
        // Traverse over the array from second index as to compare with first index
        // value
        for (int i = 1; i < n; i++) {
            // If the array index value is not equal with the previous index of an array,
            // It means, it's a distinct value, then replace that index value with
            // new distinct index value. Also, increment the value of result to check with
            // other values in an array.
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 30, 40, 50, 60, 60, 70 };
        int n = arr.length;
        System.out.println("The number of distinct arrays: " + removeDupsEff(arr, n));
    }
}