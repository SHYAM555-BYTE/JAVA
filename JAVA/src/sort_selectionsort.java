import java.util.Arrays;

public class sort_selectionsort {
    public static void main(String[] args) {
        int []arr = {3,4,5,1,2,8,-30};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = max(arr,0, last);
            int temp;
            temp = arr[last];
            arr[last]=arr[maxIndex];
            arr[maxIndex]= temp;
        }
    }
    static int max(int []arr , int start , int last){
        int max = start;
        for(int i=start ; i<=last ; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
