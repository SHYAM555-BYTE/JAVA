import java.util.Arrays;

public class iibs_1 {
    public static void main(String[] args) {
        int []arr={-9,18,24,45,66,69,88,70};
        int [] frr =arr.clone();
        Arrays.sort(frr);
        System.out.println(Arrays.toString(arr));
        int ans=bs(frr, 70);
        int x=0;
        for(int c=0;c<arr.length; c++){

            if(frr[ans]== arr[c]){
                x=c;
            }
        }
        System.out.println(x);
    }
    static int bs(int [] arr, int target){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start=mid+1;
            }
        }
        return -1;
    }

}
