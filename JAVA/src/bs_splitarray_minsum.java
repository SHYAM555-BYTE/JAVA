public class bs_splitarray_minsum {
    public static void main(String[] args) {
        int []arr = {7,2,5,10,8};
        int start=0,m=2;
        int end=0;
        for(int i = 0; i<arr.length;i++){
            start=Math.max(start , arr[i]);
            end+=arr[i];
        }
        System.out.println(start);
        System.out.println(end);
        while(start<end){
            int mid = start +(end-start)/2;
            // how many pieces can you divide
            int sum = 0;
            int pieces = 1;
            for(int i=0;i<arr.length;i++){
                if(sum + arr[i] > mid){
                    sum = arr[i];
                    pieces++;
                }
                else{
                    sum += arr[i];
                }
            }
            if(pieces > m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.print(end);
    }
}
