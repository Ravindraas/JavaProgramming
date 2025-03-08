package Sprint100;
//day -22 - check whether character is alphabet or not
public class AlaphabetOrNot {
    public static void main(String[] args) {
        //String s = "a";
        //s = s.toLowerCase();
        char ch = 'a';
        if(ch >='a' && ch<='z'){
            System.out.println("alphabet");
        }
        else{
            System.out.println("not a alphabet");
        }
    }
   /*  public static void main(String[] args) {
        String s = "a";
        s = s.toLowerCase();
        char ch = s.toCharArray()[0];
        if(ch >='a' && ch<='z'){
            System.out.println("alphabet");
        }
        else{
            System.out.println("not a alphabet");
        }
    }*/
}
