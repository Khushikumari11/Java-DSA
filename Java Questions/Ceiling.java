public class Ceiling{
    public static void main(String[] args){
        int[] arr = {2,3,34,45,66,78,90};
        int target = 46;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}