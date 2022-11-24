
public class indexelement {
    public static int first = -1;
    public static int last = -1;
    
    public static void getIndices(String str, int idx ,char el) {
       if (idx==str.length()){
           System.out.println(first);
           System.out.println(last);
           return;
       }
        char charr=str.charAt(idx);
        if(charr==el){
            if (first== -1){
                first=idx;
            }
            else{
                last=idx;
            }
            
        }
        getIndices(str,idx+1,el);
    }
    
      
        public static void main(String args[]) {
            String str="tabcdfghijakkk";
            getIndices(str,0,'a');
            
        
    }
}