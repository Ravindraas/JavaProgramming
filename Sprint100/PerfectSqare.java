package Sprint100;
// Sprint-day-8-1-PerfectSqaure-Square of a number
public class PerfectSqare {
    public static void main(String[] args) {
        int n=9;
        if(isperfectsquare(n)){
            System.out.println("given number is a perfect square");
        }
        else{
            System.out.println("given number is not a perfect square");
        }

    }
    static boolean isperfectsquare(int n){
        for(int i=1; i<n; i++){
            if(i*i == n){
                return true;
            }
        }
        return false;
    }
}
