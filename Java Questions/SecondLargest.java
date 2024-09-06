public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 68, 6,7, 94, 2};

        // Initialize variables to hold largest and second largest
        int largest = arr[0];
        int secondLargest = arr[0]; // Initialize to arr[0] assuming arr.length >= 2

        // Find the largest element in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update secondLargest to previous largest
                largest = arr[i]; // Update largest to current element
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update secondLargest if current element is greater
            }
        }

        // Print the second largest element found
        System.out.println("Second largest element is: " + secondLargest);
    }
}