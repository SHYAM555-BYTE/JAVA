import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sort_cyclicsort_mulmissing {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,3,5,6,6,7,9};
        System.out.print(missing(arr));
    }
    public static List<Integer> missing(int[]arr){
            int i=0;
            while(i<arr.length){
                int correct = arr[i];
                if(arr[i]!=arr[correct] && arr[i]<arr.length){
                    swap(arr , i , correct);
                }
                else{
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for(int x=0; x<arr.length;x++){
                if(arr[x]!=x){
                    ans.add(x);
                }
            }
            return ans;
    }
    public static void swap(int[]arr , int i , int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
