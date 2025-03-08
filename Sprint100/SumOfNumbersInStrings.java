package Sprint100;

public class SumOfNumbersInStrings {
    public static void main(String[] args) {
        String str = "ab1cd253f4g";
        sumnumber(str);

    }
    static void sumnumber(String str){
        int sum = 0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum = sum + Integer.parseInt("" +ch);
            }
        }
        System.out.println(sum);
    }
    
}
