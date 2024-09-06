public class FindIndexInMountainArray{
    public static void main(String[] args){
        int[] arr = {10,20,30,50,60,40,25,15,5};
        int target = 25;
        int ans = Search(arr,target);
        System.out.println(ans);
    }
    
    public static int Search(int[] arr,int target){
        int peak = findPeak(arr);
        int First_try = OrderAgnosticBinarySearch(arr,target,0,peak);
        
        if(First_try!=-1){
            return First_try;
        }
        return OrderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
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
    
    public static int OrderAgnosticBinarySearch(int[] arr,int target,int start,int end){
    
    boolean isAsc = arr[start]<arr[end];
    while(start<=end){
        int mid = start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
       if(isAsc){
           if(target<arr[mid]){
               end = mid -1;
           }
           else{
               start = mid+1;
           }
       }
       else{
           if(target<arr[mid]){
               start = mid+1;
           }
           else{
               end=mid-1;
           }
       }
    }
    return -1;
}
}