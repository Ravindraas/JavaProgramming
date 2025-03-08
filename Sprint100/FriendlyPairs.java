package Sprint100;
// code sprint - day- 12 - the sum of proper divisors of each numbet = anothe rnuber
public class FriendlyPairs {
    public static void main(String[] args) {
        int n1 = 2480;  // another friendly pairs are 135, 819 and 2480, 6200
        int n2 = 6200;
        int sum1 = 0;
        for(int i=1; i<=n1; i++){
            if(n1%i==0){
                sum1 = sum1 + i;
            }
        }
        int sum2 = 0;
        for(int i=1; i<=n2; i++){
            if(n2%i==0){
                sum2 = sum2 + i;
            }
        }
        if(sum1 / n1 == sum2 / n2){
            System.out.println("given numbers are friendly pairs");
        }
        else{
            System.out.println("given numbers are not friendly pairs");
        }


    }
    
}
