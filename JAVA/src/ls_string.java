public class ls_string {
    public static void main(String[] args) {
        String x="Shyam";
        char t='z';
        System.out.println(lsstring(x,t));
    }
    static boolean lsstring(String x , char t){
        if(x.length()==0){
            return false;
        }
        else{
            for(int f=0;f<x.length();f++){
                if(x.charAt(f) == t){
                    return true;
                }
            }
        }
        return false;
    }
}
