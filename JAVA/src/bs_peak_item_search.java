public class bs_peak_item_search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,2,1};
        int peak = peaksearch(arr);
        int firsttry = bs(arr , 0 , peak,3);
        if(firsttry == -1){
            firsttry = bs(arr , peak+1 , arr.length-1, 3);
        }
        System.out.println(firsttry);
    }
    static int peaksearch(int [] arr) {
        int start = 0, end = arr.length - 1;
        int t = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int bs(int [] arr , int start ,  int end , int target){
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
        }
        return -1;
    }
}
