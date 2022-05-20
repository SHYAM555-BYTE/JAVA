import java.util.Arrays;

public class bs_int_ceiling {
    public static void main(String[] args) {
        int []arr={-9,18,24,45,66,69,70};
        int ans = ceil(arr, -10);
        System.out.println(ans);

    }
    static int ceil(int [] arr , int target){
        int start=0, end=arr.length-1;
        int f=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                end = mid-1;
                f=end+1;
            }
            else if(arr[mid] < target){
                start=mid+1;
                f=start;
            }
        }
        if(f> arr.length-1 || f<0){
            return -1;
        }
        return arr[f];
    }
}

