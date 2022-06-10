import java.util.Arrays;

public class two_D_array {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        System.out.println(arr.length);
        int l[];
        l = twod(arr,49);
        System.out.print(Arrays.toString(l));
    }
    static int[] twod(int [][] arr ,int target){
        int [] ans;
        int r = 0;
        int c =arr.length-1;
        while(r<arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}


