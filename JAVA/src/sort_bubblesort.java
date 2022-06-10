import java.util.Arrays;

public class sort_bubblesort {
    public static void main(String[] args) {
        int[]arr = {7,6,3,1,2};
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp;
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
