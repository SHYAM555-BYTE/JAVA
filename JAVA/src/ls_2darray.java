import java.util.Arrays;

public class ls_2darray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {5,6,7},
                {43,54,56,78,79}
        };
        int []x = tdsearch(arr,13);
        System.out.println(Arrays.toString(x));
    }
    static int[] tdsearch(int [][] arr, int target){
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                 ans[0]=row+1;
                 ans[1]=col+1;
                }
            }
        }
        return ans;
    }
}
