package Sprint100;

public class PrimeNumberUsingCount {
    public static void main(String[] args) {
        int n=9;
        prime(n);

    }
    static void prime(int n){
        int count = 0;
        //prime number which is divisible by only 1 and itself so count ==2
        for(int i=1; i<=n;i++){
            if(n%i==0){
                count = count + 1;
            }
        }
        if(count == 2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
    
}
