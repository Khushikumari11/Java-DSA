public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        reverseArray(arr);
        // Printing the reversed array to verify the output
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
