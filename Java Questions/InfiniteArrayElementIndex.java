public class InfiniteArrayElementIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        int indexOfElement = ans(arr, target);
        System.out.print(indexOfElement);
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Condition for the doubling:
        while (true) {
            try {
                if (target <= arr[end]) {
                    break;
                }
                // Double the range
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (IndexOutOfBoundsException e) {
                // Handle when end goes out of bounds
                break;
            }
        }

        return BinarySearch(arr, target, start, end);
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } catch (IndexOutOfBoundsException e) {
                end = mid - 1; // Adjust end if mid is out of bounds
            }
        }
        return -1;
    }
}