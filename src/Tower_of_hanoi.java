import java.util.*;
public class Tower_of_hanoi {
    public static void towerofhanoi(int n , String src, String hlp, String dest  ) {

        if(n==1){
            System.out.println("transfer disk " +n+ " from " +src+ " to " +dest);
            return;
        }
        towerofhanoi(n-1,src,dest,hlp);
        System.out.println("transfer disk " +n+ " from " +src+ " to " +dest);
        towerofhanoi(n-1, hlp, src, dest);
        
    }
    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n, "S","H", "D");
        
    }
    
}
//toh(3, s,h,d)
    //toh(2,s,h,d)
