import java.util.Arrays;

public class sort_cyclicsort {
    public static void main(String[] args) {
        int []arr = {3,1,2,4,5};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int []arr){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=i+1){
                arr[i]=i+1;
            }
        }
    }
}
