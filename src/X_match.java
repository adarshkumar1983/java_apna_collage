public class X_match {
    public static void move_all_X(String str,int idx,int count,String newstr) {
        if( idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
           System.out.println(newstr);
              return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            move_all_X(str,idx+1,count,newstr);
        }else
    {
        newstr+=currchar;
        move_all_X(str,idx+1,count,newstr);
    }
        
    }
    public static void main(String[] args) {
        String str="axxbcxxd";
        move_all_X(str,0,0,"");
        
    }
    
}
