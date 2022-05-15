public class ls_range {
    public static void main(String[] args) {
        int [] arr= {24,45,46,4,7,8,9,10,12};
        int x= lsrange(arr, 4,8,22);
        System.out.print(x);
    }
    static int lsrange(int [] arr, int start, int end, int target){
        int f=-1;
        while(start<=end){
            if(arr[start]==target){
              f=start;
            }
            start++;
        }
        return f;
    }
}
