import java.util.Arrays;
public class ArrayPairing{
    public static void main(String[] args){
        int[] array= {1,2,3,4,5,6,7,8};
        String[] result = new String[array.length-2];
        for(int i=0;i<array.length-2;i++){
            result[i] = ""+ array[i]+array[i+2];
        }
        System.out.print(Arrays.toString(result));
    }
}