import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_cyclicsort_mulmissing {
    public static void main(String[] args) {
        int [] arr = {0,1,2,-1,3,3,3,5,6,6,7,9};
        System.out.print("List of all missing numbers"+missing(arr));
    }
    public static List<Integer> missing(int[]arr){
            int i=0;
            while(i<arr.length){
                if(arr[i]>0)
                {
                int correct = arr[i];
                if(arr[i]!=arr[correct] && arr[i]<=arr.length && arr[i]>0){
                    swap(arr , i , correct);
                }
                else{
                    i++;
                }
                }
                else{
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            List<Integer> repeated = new ArrayList<>();
            for(int x=0; x<arr.length;x++){
                if(arr[x]!=x){
                    ans.add(x);
                    if(repeated.contains(arr[x]) || arr[x]<0){

                    }
                    else {
                        repeated.add(arr[x]);
                    }
                }
            }
            System.out.println("Smallest positive missing number "+Collections.min(ans));
            System.out.println("List of all repeated numbers"+repeated);
            return ans;
    }
    public static void swap(int[]arr , int i , int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
