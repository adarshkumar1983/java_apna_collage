import java.util.Scanner;

public class funtction {
    public static void printer(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        printer(name );

        
    }
    
}
