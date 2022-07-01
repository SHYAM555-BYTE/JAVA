public class pattern {
    public static void main(String[] args) {
        patterni(5);
        patternii(5);
        patterniii(5);
        patterniv(5);
        patternv(5);
        patternvi(5);
        patternvii(5);
        patternviii(5);
        patternix(5);
        patternx(5);
        patternxi(5);
        patternxii(5);
        patternxiii(5);
        patternxiv(5);
        patternxv(5);
        patternxvi(5);
    }

    static void patterni(int n){
        System.out.printf("\n\nPattern 1 \n");
        for(int x=1;x<=n;x++){
            for(int y=1;y <=n;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternii(int n){
        System.out.printf("\n\nPattern 2\n");
        for(int x=1;x<=n;x++){
            for(int y=1;y<=x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patterniii(int n){
        System.out.printf("\n\nPattern 3 \n");
        for(int x=1;x<=n;x++){
            for(int y=n;y >=x;y--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterniv(int n){
        System.out.printf("\n\nPattern 4\n");
        for(int x=1;x<=n;x++){
            for(int y=1;y<=x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
    static void patternv(int n){
        System.out.printf("\n\nPattern 5\n");
        for(int x=1;x<n;x++){
            for(int y=1;y<=x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x=1;x<=n;x++){
            for(int y=n;y>=x;y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternvi(int n){
        System.out.printf("\n\nPattern 6\n");
        for(int x=1;x<=n;x++){
            for(int y=n;y>=x;y--) {

                System.out.print(" ");
            }
            for(int z=1 ; z<=x;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternvii(int n){
        System.out.printf("\n\nPattern 7\n");
        for(int x=1;x<=n;x++){
            for(int z=0 ; z<x;z++){
                System.out.print(" ");
            }
            for(int y=n;y>=x;y--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternviii(int n){
        System.out.printf("\n\nPattern 8\n");
        for(int x=1;x<=2*n;x=x+2){
            int z=1;
           while(z<=(n)-x/2){
               System.out.print(" ");
               z++;
           }
            for(int y=1;y<=x;y++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternix(int n){
        System.out.printf("\n\nPattern 9\n");
        for(int x=1;x<=2*n;x=x+2){
            int z=n;
            while(z>=(n)-x/2){
                System.out.print(" ");
                z--;
            }
            for(int y=2*n;y>x;y--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternx(int n){
        System.out.printf("\n\nPattern 10\n");
        for(int x=1;x<=n;x++){
            int z=0;
            while(z<=n-x){
                System.out.print(" ");
                z++;
            }
            for(int y=1;y<=x;y++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternxi(int n){
        System.out.printf("\n\nPattern 11\n");
        for(int x=1;x<=n;x++){
            int z=n;
            while(z>n-x){
                System.out.print(" ");
                z--;
            }
            for(int y=n;y>=x;y--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternxii(int n) {
        System.out.printf("\n\nPattern 12\n");
        for (int x = 1; x <= n; x++) {
            int z = n;
            while (z >n-x) {
                System.out.print(" ");
                z--;
            }
            for (int y = n; y >= x; y--) {

                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=1;x<=n;x++){
            int z=0;
            while(z<=n-x){
                System.out.print(" ");
                z++;
            }
            for(int y=1;y<=x;y++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternxiii(int n){
        System.out.printf("\n\nPattern 13\n");
        for(int x=1;x<=n;x++){
            int z=0,c=1;
            while(z<n-x){
                System.out.print(" ");
                z++;
            }
            for(int y=1;y<x;y++) {
                System.out.print(" ");
                if(y==1 || y==x-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(x==n) {
                while (c < 2 * n) {
                    System.out.print("*");
                    c++;
                }
            }
            }
        }
        static void patternxiv(int n){
            System.out.printf("\n\nPattern 14\n");
            int c;
            System.out.print(" ");
            for(c=1;c<2*n;c++){
                System.out.print("*");
            }
            System.out.println();
            for(int x=1;x<=n;x++){
                int z=n;
                while(z>n-x){
                    System.out.print(" ");
                    z--;
                }
                for(int y=n;y>x;y--) {
                    System.out.print(" ");
                    if(y==n || y==x+1) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
        static void patternxv(int n) {
        System.out.printf("\nPattern15 \n");
            for (int x = 1; x <= n+1; x++) {
                int z = 0, c = 1;
                while (z < n+1-x) {
                    System.out.print(" ");
                    z++;
                }
                for (int y = 1; y < x; y++) {
                    System.out.print(" ");
                    if (y == 1 || y == x - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int x=1;x<=n;x++) {
                int z = n;
                while (z > n-x) {
                    System.out.print(" ");
                    z--;
                }
                for (int y = n; y > x; y--) {
                    System.out.print(" ");
                    if (y == n || y == x + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    static void patternxvi(int n){
        System.out.printf("\nPattern15 \n");

        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 +"s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
