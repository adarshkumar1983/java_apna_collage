public class recurtion3 {
    public static int  fact(int n) {
      if(n==0||n==1){
         return 1;
      }
      int fact_n1 = fact(n-1);
      int fact_n2 = n * fact_n1;
      return fact_n2;

        
    }
    public static void main(String[] args) {
      int n=5;
      int ans =fact(n);
      System.out.println(ans);
        
    }
    
}
