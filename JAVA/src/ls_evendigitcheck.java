import java.util.Arrays;

public class ls_evendigitcheck {
    public static void main(String[] args) {
        int [] arr = {12,31,234,2,3456,543,54,12};
        int [] ans=even(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] even(int [] arr){
        int f=0,c=0;
        int [] ans =new int[arr.length];
        while(c<arr.length){
           if( (((int)(Math.log10(arr[c])))+1) % 2 == 0){
               ans[f]=arr[c];
               f++;
            }
           c++;
        }
        f=f-1;
        int [] ans1= new int[arr.length-f];
        for(int g=0; g<ans1.length;g++){
            ans1[g]=ans[g];
        }
        return ans1;
    }
}
