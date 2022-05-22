public class bs_infinitesortedarraysearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10,11};
        int s = fixrange(arr , 5);
        System.out.println(s);
    }
    static int fixrange(int [] arr , int target){
        int start=0;
        int end=1;
        while(arr[end] < target){
          int temp= end + 1;
          end = temp + ( end - start + 1) * 2;
          start= temp ;
        }
        return binarysearch(arr , start , end ,target);
    }
    static int binarysearch(int []arr , int start , int end ,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end=mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
        }
        return -1;
    }
}
