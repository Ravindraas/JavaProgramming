package Sprint100;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "ABCCB";
        nonrepeating(s);
    }
    //non repeating character
    static void nonrepeating(String s){
        for(int i=0; i<s.length();i++){
            //use boolean  
            boolean isnotrepeating = true;
            for(int j=0; j<s.length(); j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    isnotrepeating = false;
                    break;
                }
            }
            if(isnotrepeating){
                System.out.println(s.charAt(i));
                break;
            }
        }

    }
}
