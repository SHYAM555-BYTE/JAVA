public class linearsearch {
    public static void main(String[] args) {
        int [] arr={3,6,89,90};
        int x = linearsearch(arr,89);
        System.out.println(x);
    }
    // search in the array
    static int linearsearch(int [] arr, int target){
        int f=-1;
        for(int s=0; s<arr.length; s++){
            if(arr[s]==target){
                f=s;
            }
        }
        if(f!=-1) {
            return f;
        }
        else{
            return -1;
        }
    }

}
