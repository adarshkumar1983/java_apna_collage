
public class reverse
{
    public static void  reverse_string(String str,int idx)
    {
        if(idx==0){
           System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverse_string(str,idx-1);
 
 
    }
	public static void main(String[] args) {
	    String str ="abcd";
	    reverse_string(str,str.length()-1);

	
	}
}
