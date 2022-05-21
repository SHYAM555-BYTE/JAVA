import java.util.Arrays;

public class bs_sortedarray_fl {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,5,6,7,7,7,8,8,9};
        int []ans = new int[2];
        ans[0]= fl(arr , 7 , true);
        ans[1]=fl(arr,7,false);
        System.out.println(Arrays.toString(ans));
    }
    static int fl(int [] arr, int t , boolean ft){
        int ans = -1;
        int start=0, end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
                if(arr[mid]==t){
                    ans = mid;
                    if(ft==true){
                        end = mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else if(arr[mid]>t){
                    end=mid-1;
                }
                else if(arr[mid]<t){
                    start=mid+1;
                }
            }
        return ans;
    }
}
