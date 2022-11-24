public class dublicate {
    public static boolean[]map=new boolean[26];
    public static void dublicate_remove(String str,int idx,String newstring) {
        if(idx ==str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            dublicate_remove(str, idx+1, newstring);
        }else{
            newstring+=currchar;
            map[currchar='a']=true;
            dublicate_remove(str, idx+1, newstring);
        }
        
    }
    public static void main(String[] args) {
        
    String str ="abbccda";
    dublicate_remove(str, 0, "");
    }
    
}
