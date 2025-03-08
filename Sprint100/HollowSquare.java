package Sprint100;
//day -28
public class HollowSquare {

    public static void main(String[] args) {
        // print the hallow square
        //for row loop
        int n=5;
        for(int row = 1; row<=n; row++){
            //for column loop
            for(int col = 1; col<=n; col++){
                if(col==1 || col==n || row == 1 || row == n){
                    System.out.print("* ");
                }
                else{
                    System.out.println("  ");
                    
                }

            }
            System.out.println();
        }
    }
    
}
