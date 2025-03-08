package Sprint100;
// day - 20 - 1st - problem
public class RemoveCharacters {
    public static void main(String[] args) {
        //Remove all characters from string except alphabets
        String str = "hello my name is ravindra";
        //String result = removecha(str);
        //System.out.println(result); ///-----1
        //remove(str); /// ----2
        String ans = removespace(str);
        System.out.println(ans);

    }
    static String removecha(String s){
        return s.replaceAll("[^a-zA-Z]", "");
    }
    //another method
    static void remove(String s){
        s = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s);

    }
    //day 20 - 2nd- problem
    //remove all spaces from characters
    static String removespace(String s){
        return s.replaceAll(" ", "");
    }


}
