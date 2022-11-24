import java.util.*;
public class Find2D_Array {
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
        int x= sc.nextInt();
     //out[put]
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
             if(number[i][j]==x){
                System.out.print("this is location of array"+ "("+ i +" "+ j+")");

             }
            }
          
        }


    }
    
}
