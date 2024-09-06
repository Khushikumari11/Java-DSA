public class RotatedArrayBinarySearch{
    public static void main(String[] args){
        int[] arr = {6,7,8,0,1,2,3};
        System.out.println(Search(arr,2));
    }
     public static int Search(int[] arr,int target){
          int pivot = findPivot(arr);
          //if pivot not found simply do binary search, as it is not Rotated
          if(pivot==-1){
              return BinarySearch(arr,target,0,arr.length-1);
          }
          // if pivot is found three cases are there
          if(arr[pivot]==target){
              return pivot;
          }
          if(target>=arr[0]){
              return BinarySearch(arr,target,0,pivot-1); //pivot-1 as u have already checked pivot==target or not
          }
          return BinarySearch(arr,target,pivot+1,arr.length-1);
      }
       public static int findPivot(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
               int mid = start+(end-start)/2;
                 //Four cases possible:
               if(mid<end && arr[mid]>arr[mid+1]){//make sure to give range
                   return mid;
               }
               if(mid>start && arr[mid]<arr[mid-1]){//make sure to give range
                   return mid-1;
               }
               if(arr[mid]<=arr[start]){
                   end = mid-1;
               }
               else{
                   start = mid+1;
               }
            }
            return -1;
        }
    
        
        public static int BinarySearch(int[] arr,int target,int start,int end){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(target<arr[mid]){
                    end = mid -1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    
}