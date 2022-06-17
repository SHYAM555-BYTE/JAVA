import java.util.Arrays;

public class sort_cyclicsort {
    public static void main(String[] args) {
        int []arr = {3,1,2,4,5};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int []arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){
                int temp;
                temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }

    }
}
