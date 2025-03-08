package Sprint100;
//Sprint100-day9-Harshadnumber- number which is divisible of sum of it's digits 
public class HarshadNumber {
    public static void main(String[] args) {
        int n=541;
        if(isharshadnumber(n)){
            System.out.println("given number is a harshad nubmer");
        }
        else{
            System.out.println("given number is not a harshad nubmer");
        }
        }
    static boolean isharshadnumber(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int rem = temp % 10;
            sum = sum+rem;
            temp=temp/10;
        }
        //return (n%sum==0);
        if(n%sum==0){
            return true;
        }
        return false;

    }
    
}
