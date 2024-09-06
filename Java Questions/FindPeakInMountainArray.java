public class FindPeakInMountainArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,6,4,3,2};
        int ans = findPeak(arr);
        System.out.println(ans);
    }
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //descending part of array, hence ans lies in LHS part.
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;   // or end as both start and end will be equal at last.
    }
}
