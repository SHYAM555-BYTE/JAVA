public class recursion_fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(50));
    }
    static float Fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }
}
