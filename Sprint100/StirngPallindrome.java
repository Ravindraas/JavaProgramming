public class StirngPallindrome {
    public static void main(String[] args) {
        String str= "abaaa";
        ispallidrome(str);

    }
    static void ispallidrome(String str){
        char[] ch = str.toCharArray();
        String  newString = "";
        for(int i=ch.length - 1; i>=0; i--){
            newString += ch[i];

        }
        if(str.equals(newString)){
            System.out.println("given string is pallidrome");
        }else{
            System.out.println("given string is not a pallidrome");
        }
    }
    
}
