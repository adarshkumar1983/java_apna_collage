import java.util.*;
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coln = sc.nextInt();
        int [][]number=new int [row][coln];

        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                number[i][j]=sc.nextInt();
            }

        }
        //out[put]
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
         System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
