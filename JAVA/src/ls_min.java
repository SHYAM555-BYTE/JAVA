public class ls_min {
    public static void main(String[] args) {
        int []arr={4,4,56,78,-5,5,6};
        int y = min(arr);
        System.out.println(y);
    }
    static int min(int[] arr){
        int x=0;
        int f=arr[0];
        while(x<arr.length){
            if(f>=arr[x]){
                f=arr[x];
            }
            x++;
        }
        return f;
    }
}
