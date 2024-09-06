import javafx.util.Pair;

class MaxMin{
    public Pair<Long, Long> getMinMax(int[] arr) {
        long min = getMin(arr);
        long max = getMax(arr);
        return new Pair<>(min, max); 
    }
    public int getMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
         return min;
    }
    public int getMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
