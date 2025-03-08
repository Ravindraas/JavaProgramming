package Sprint100;
//Sprint100-day8-2-automorphic number - last digit of a square number = its self
public class AutomorphicNumber {
    public static void main(String[] args) {
        //automorphic number - number which square of last digits = given number
        int n=4;
        int k = n*n;
        int d = 10;
        int ans= 0;
        while(ans < n){
            ans = k % d;
            d = d * 10;
        }
        if(ans == n){
            System.out.println("given numbet is a automorphic number");
        }
        else{
            System.out.println("given numbet is not a  automorphic number");
        }
    }
    
}

