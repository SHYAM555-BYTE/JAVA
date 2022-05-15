import java.util.Arrays;

public class array {
    public static void main(String[] args) {
       int [] arr = {24,45,56,78};
       arr = reverse(arr);
       System.out.println(Arrays.toString(arr));
    }
    static int [] reverse(int [] arr) {
            int start=0;
            int end=arr.length-1;
            while(start < end){
                swap(arr, start, end);
                start++;
                end--;
            }
            return arr;
    }
    static void swap(int [] arr, int a, int b){
        int t;
        t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
