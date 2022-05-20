public class bs_smchar_in {
    public static void main(String[] args) {
        char [] arr = {'a','b','c','g','h'};
        char f = sm(arr , 'z');
        System.out.println(f);
    }
    static char sm(char [] arr, char t){
        int start=0, end=arr.length-1;
        int f=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == t){
                return arr[mid];
            }
            else if(arr[mid] > t){
                end = mid-1;
                f=end+1;
            }
            else if(arr[mid] < t){
                start=mid+1;
                f=start;
            }
        }
        if(f> arr.length-1 || f<0){
            f=0;
        }
        return arr[f];
    }
}
