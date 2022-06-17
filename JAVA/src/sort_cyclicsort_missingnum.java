public class sort_cyclicsort_missingnum {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1,5,4};
        System.out.println(missing(arr));
    }

    public static int missing(int[] arr) {
        int i=0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
        for(int index=0 ; index<arr.length; index++){
            if(arr[index]!= index) {
                return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int i ,int j){
        int temp;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
