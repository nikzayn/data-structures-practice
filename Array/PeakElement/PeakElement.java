// Given an array of integers. Find a peak element in it. An array element is a peak if it is NOT smaller than its neighbours. 
// For corner elements, we need to consider only one neighbour.

class PeakElement {
    static int findPeak(int[] arr, int low, int high, int n) {
        // Index element
        int mid = low + (high - low) / 2;

        // Check if the middle element is the peak and it is greater than its neighbours
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        }

        // Check if the left element is the peak or not and it is greater than its
        // neighbours
        else if (mid > 0 && arr[mid - 1] >= arr[mid]) {
            return findPeak(arr, low, mid - 1, n);
        }

        // or else the right element is the peak and it is greater than its neighbours
        else {
            return findPeak(arr, mid + 1, high, n);
        }
    }

    static int peakElem(int[] arr, int n) {
        return findPeak(arr, 0, n - 1, n);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 10, 1 };
        int n = arr.length;
        System.out.println("Index of a peak point is: " + peakElem(arr, n));
    }
}