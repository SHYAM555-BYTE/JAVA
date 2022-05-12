import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        int [] arr={1,3,29,77};
        System.out.println(maxRange(arr,0,3));
    }
    static int maxRange(int[] arr, int start , int end){
        int maxval=arr[start];
        for(int y=start; y<=end; y++){
            if(arr[y]>maxval){
                maxval=arr[y];
            }
        }
        return maxval;
    }
}