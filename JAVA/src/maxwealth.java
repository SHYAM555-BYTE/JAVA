import java.util.Arrays;

public class maxwealth {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {9,10,11},
        };
        int x =max(arr);
        System.out.println(x);
    }
    static int max(int [] [] arr){
        int ans;
        int []maxm = new int [arr.length];
        for(int row=0; row<arr.length; row++){

            ans=0;
            for(int col=0;col<arr[row].length;col++){
                ans=ans+arr[row][col];
            }
            maxm[row]=ans;
        }
        int maxtotal = maximum(maxm);
        return maxtotal;
    }
    static int maximum(int [] arr){
        int t=arr[0];
        for(int i=0; i < arr.length; i++){
            if(t<=arr[i]){
                t=arr[i];
            }
        }
        return t;
    }
}
