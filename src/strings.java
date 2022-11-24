
public class strings {
    
    public static void main(String[] args) {
        String firstname ="adarsh";
        String lastname ="kumar";
        String myself= firstname+ " "+lastname;
        System.out.println(myself);
        System.out.println(myself.length());
        for(int i=0;i<myself.length();i++){
            System.out.println(myself.charAt(i));
        }
        
    }
}
