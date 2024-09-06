import java.util.Arrays;
public class ChocolateDistribution{
    public static void main(String[] args){
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int result = find(arr,arr.length,3);
        System.out.println("Minimum difference in maximum and minimum chocolate packets: " + result);
    }
    public static int find(int[] arr,int n,int m){
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0;i <= n - m ; i++){
            int minw = arr[i];
            int maxw = arr[i+m-1];
            int difference = maxw-minw;
            
            if(difference<ans){
                ans = difference;
            }
        }
        return ans;
    }
}
