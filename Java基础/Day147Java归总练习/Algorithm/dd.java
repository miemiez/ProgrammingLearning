package Day0617.binarySearch;

public class dd {
    public static void main(String[] args) {
        int[] arr = {1, 13, 44, 48, 123, 222, 312, 444, 666, 2392};
        System.out.println(search(arr, 312));
    }

    public static int search(int arr[], int t) {
        int left = 0;
        int right = arr.length;
        int mid = 0;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (t > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
