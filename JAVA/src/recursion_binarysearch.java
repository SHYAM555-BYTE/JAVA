
public class recursion_binarysearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        System.out.print(rbs(arr , 0 , arr.length-1,7));
    }
    static int rbs(int []arr , int s , int e, int t) {
        if (s <= e) {
            int m = (s+e)/2;
            if (t == arr[m]) {
                return m;
            }
            else if (t > arr[m]) {
                return rbs(arr, m+1, e, t);
            }
            else {
                return rbs(arr, s, m-1, t);
            }
        }
        return -1;
    }
}
