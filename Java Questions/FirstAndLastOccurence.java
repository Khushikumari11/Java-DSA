public class FirstAndLastOccurence{
    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,5,5,5,5,6,7,8,9};
       int target = 5;
     int[] result = SearchRange(arr,target);
     System.out.print("First Occurence "+result[0]+" "+ "Last Occurence "+result[1]);
     
    }
    public static int[] SearchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        //Check for first occurence of the target:
      int start =  BinarySearch(arr,target,true);
      int end   =  BinarySearch(arr,target,false);
      
      ans[0] = start;
      ans[1] = end;
      
      return ans;
    }
    public static int BinarySearch(int[] arr,int target,boolean findStartIndex){
        int ans = -1;
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
               ans = mid;
            
            if(findStartIndex){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
         }
       }
        return ans;
    }
}
