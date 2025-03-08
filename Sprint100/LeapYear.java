package Sprint100;

public class LeapYear {
    public static void main(String[] args) {
        int n = 2002;
        findleapyear(n);
    }
    //checking leap year or not
    static void findleapyear(int n){
        if(n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)){
            System.out.println("given year is a leap year");
        }
        else{
            System.out.println("given year is not a leap year");
        }
    }
    
}
