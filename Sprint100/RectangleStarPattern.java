package Sprint100;
//day - 29 - print the rectangle star pattern
public class RectangleStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 3; row>=0; row--){
            for(int col = 1; col<=n; col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    /*class RectanglePattern{
    public static void main(String arga[]){
        int n=4;
        int m=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
   
            }
            System.out.println();
        }
    }
} */
    
}
