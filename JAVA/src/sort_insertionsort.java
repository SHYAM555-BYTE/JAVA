import java.util.Arrays;

public class sort_insertionsort {
    public static void main(String[] args) {
        int []arr ={1,6,5,4,3,2,-20,90};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0){
                if(arr[j]>arr[j-1]){
                    break;
                }
                else{
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
        }
    }

}
