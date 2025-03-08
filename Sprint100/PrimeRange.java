package Sprint100;

public class PrimeRange {
    public static void main(String[] args) {
       /* int n1=10;
        int n2 = 30;
        while(n1<=n2){
            if(isprime(n1)){
                System.out.println(n1);
            }
            n1++;
        }*/
        // sum of 10 prime numbers
        int n = 10;
        int sum = 0;
        for(int i =2; i<=n; i++){
            if(isprime(i)){
                sum = sum + i;
            }
            
        }
        System.out.println(sum);

    }
    //checking prime or not
    static boolean isprime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count  = count + 1;
            }
        }
        return (count==2);
    }
    
}
