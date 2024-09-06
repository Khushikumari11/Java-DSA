import java.util.ArrayList;

public class CheckOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(8);
        numbers.add(6);

        boolean isOdd = checkOdd(numbers);

        if (isOdd) {
            System.out.println("List contains only odd numbers");
        } else {
            System.out.println("List contains both even and odd numbers");
        }
    }

    public static boolean checkOdd(ArrayList<Integer> list) {
        for (int number : list) {
            if (number % 2 == 0) { // Check if the number is even
                return false; // Return false if any even number is found
            }
        }
        return true; // Return true if all numbers are odd
    }
}