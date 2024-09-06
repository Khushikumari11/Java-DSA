import java.util.Arrays;
public class OtherWayEqualArrays {
    // other way without arrays.equals:

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 40};
        int[] arr2 = {2, 3, 1, 4};

        if (arr1.length != arr2.length) {
            System.out.println("Arrays do not contain the same elements");
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean areEqual = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            System.out.println("Arrays contain the same elements");
        } else {
            System.out.println("Arrays do not contain the same elements");
        }
    }
}

