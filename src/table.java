import java.util.Scanner;

public class table {
    public static void main(String[]args){
        int n,table;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number what you want to print the table");
        n= sc.nextInt(); 
        for(int i=1;i<=10;i++){
    
            System.out.println(n+ "*" +i+ "=" +n*i);


        }

    }
}
