public class StringPallindrom2 {
    public static void main(String[] args) {
        String str = "ajjba";
        boolean ans =  ispallindrome(str);
        System.out.println(ans);

    }
    static boolean ispallindrome(String str){
        int start = 0;
        int end = str.length() -1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            //return false;
            start++;
            end--;

        }
        return true;
    }

}
    

