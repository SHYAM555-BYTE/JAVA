import java.util.Arrays;

public class bs_two_dmatrixsorted {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(SearchSorted(arr, 1)));
    }
    static int[] bs(int [][]arr ,int row, int cstart , int cend , int target){
        while(cstart<=cend){
            int mid = cstart +(cend -cstart)/2;
            if(arr[row][mid] == target){
                return new int[] {row,mid};
            }
            else if (arr[row][mid] > target){
                cend = mid-1;
            }
            else{
                cstart=mid+1;
            }
        }
        return new int [] {-1,-1};
    }
    static int[] SearchSorted(int [][]arr , int target){
        int rows=arr.length;
        int cols = arr[0].length;
        if(rows==1){
            return bs(arr , 0 , 0,cols-1,target);
        }
        if(cols == 0){
            return new int [] {-1,-1};
        }
        int rstart = 0;
        int rends = rows-1;
        int cmid = cols/2;
        while(rstart < (rends-1)){
            int mid = rstart +(rends-rstart)/2;
            if(arr[mid][cmid] ==target){
                return new int[]{mid,cmid};
            }
            if(arr[mid][cmid]< target){
                rstart=mid;
            }
            else{
                rends = mid;
            }
        }
        if(arr[rstart][cmid] == target){
            return new int[]{rstart , cmid};
        }
        if(arr[rstart+1][cmid] == target){
            return new int[]{rstart+1 , cmid};
        }
        if(arr[rstart][cmid-1] >=target){
            return bs(arr , rstart , 0,cmid-1,target);
        }
        if(arr[rstart][cmid+1]<=target){
            return bs(arr , rstart , cmid+1,cols-1,target);
        }
        if(arr[rstart+1][cmid-1] >=target){
            return bs(arr , rstart+1 , 0,cmid-1,target);
        }
        else{
            return bs(arr , rstart+1 , cmid+1,cols-1,target);
        }
    }
}
