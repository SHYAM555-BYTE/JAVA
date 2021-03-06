public class bs_rotatedarray_search {
    public static void main(String[] args) {
        int []arr ={4,5,9,2,3};
        int pivot = findpivot(arr);
        int t=4,ans;
        if(pivot == -1){
            ans = bs(arr , 0 ,arr.length-1,t);
        }
        if(t == arr[pivot]){
            ans = pivot;
        }
        if(t>=arr[0]){
            ans = bs(arr , 0 , pivot-1 , t);
        }
        else{
            ans = bs(arr , pivot+1 , arr.length-1 , t);
        }
        System.out.println(ans);
    }
    static int findpivot(int []arr){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start +  (end - start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int bs(int []arr , int start , int end , int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(arr[mid]>target){
                start = mid+1;
            }
            else if(arr[mid]<target){
                end = mid-1;
            }
        }
        return -1;
    }
}
