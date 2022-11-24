class Recursion3 {
    public static void printFactorial(int a, int b, int n) {
    if(n == 0) {
    return;
    }
    int c= a+b;
    System.out.println(c);
  
    printFactorial(b, c, n-1);
    }
    public static void main(String args[]) {
      
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n= 7;
    printFactorial(0, 1, n-1);
    }
    }