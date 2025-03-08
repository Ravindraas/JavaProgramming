package Sprint100;
//day - 22

public class VowelOrConsonent {
    // check given character is vowel or consonent
    public static void main(String[] args) {
        String str = "H";
        str = str.toLowerCase();
        char ch = str.charAt(0);
        if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch =='u'){
            System.out.println("given char is a vowel");
        }
        else{
            System.out.println("given char is a consonent");
        }
    }
    
}
