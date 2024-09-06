import java.util.Arrays;
public class CheckEqualArrays{
    public static void main(String[] args){
        int[] arr1 = {1,22,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        boolean status = Arrays.equals(arr1,arr2);
        
        if(status == true){
            System.out.print("Arrays contain same elements");
        }
        else{
            System.out.print("Arrays does not contain same elements");
        }
    }
}