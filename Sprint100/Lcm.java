public class Lcm{
    public static void main(String[] args) {
        int a=4;
        int b=2;
        int ans = lcm(a,b);
        System.out.println(ans);
        
    
    }
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;

        }
        return a;
        

    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}