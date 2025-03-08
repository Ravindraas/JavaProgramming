package Sprint100;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 10;
        int sum=0;
        int originalnumber = n;
        for(int i=1; i<n;i++){
            if(n%i==0){
                sum = sum +i;
            }
        }
        //System.out.println(sum);
        if(sum == originalnumber){
            System.out.println("given number is a perfect number");
        }
        else{
            System.out.println("given number is a not perfect number");

        }
    }

    
}
