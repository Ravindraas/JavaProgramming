package Sprint100;
// code sprint day 10
public class PrimeNumber{
    public static void main(String[] args) {
        int n = 10;
        int count = n+1;
        while(count > n){
            if(isPrime(count)){
                System.out.println(count);
                return;
            }
            count++;
        }
        //prime number below 10
        //int n=10;
        while(i<=n){
            if(isprime(i)){
                System.out.println(count);
            }
            i++;
        }

    }
    
    public static boolean isPrime(int n){
        //print the next prime number
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count += 1;
            }
        }
        return (count==2) ;
    }
}