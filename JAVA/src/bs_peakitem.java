public class bs_peakitem {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,4,3,2,1};
        int s = peak(arr);
        System.out.println(s);
    }
    static int peak(int [] arr) {
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
}
