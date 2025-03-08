package Sprint100;

public class StrongNumber {
    //day 6
    // strong number : a number which sum of factorials of each digit is equal to itself
    static int sum =0;
    public static void main(String[] args) {
        int n= 145;
        int original_number = n;
        strongnumber(n, original_number);
        if(sum == original_number){
            System.out.println(" given number is a strong number");
        }
        else{
            System.out.println("the given number is not a strong number");
        }
    }
    static void strongnumber(int n, int original_number){
        //int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + fact(rem);
            n = n / 10;
        }
        /*if(sum == original_number){
            System.out.println(" given number is a strong number");
        }
        else{
            System.out.println("the given number is not a strong number");
        }*/
    }
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
    
}
