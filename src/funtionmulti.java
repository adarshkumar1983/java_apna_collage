 import java.util.*;
public class funtionmulti {
    public static int multi(int a,int b) {
        int multiply =a*b;
        return multiply;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
       int  b=sc.nextInt();
        int multiply= multi(a, b);
        System.out.println(multiply);
        
    }
    
}
