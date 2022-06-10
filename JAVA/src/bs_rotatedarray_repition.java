public class bs_rotatedarray_repition {
    public static void main(String[] args) {
        int [] arr = {6,1,2,2,4,5,5};
        int pivot = findreppivot(arr);
        System.out.println(pivot);
        int t=2,ans;
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
    static int findreppivot(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
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
