package Sprint100;
// day - 24 
public class ReplaceSubString {

    public static void main(String[] args) {
        String  s = "Ravindra, hi how are you";
        replace1(s);
    }
    static void replace1(String s){
        s = s.replaceAll("hi", "kukkapilla");
        System.out.println(s);

    }
}
