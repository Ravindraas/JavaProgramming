package Sprint100;
//day - 29 - print the rhombus  pattern
public class RhombusPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int spaces = 1; spaces <=n-row; spaces++){
                System.out.print(" ");
            }
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            for(int spaces = 1; spaces <=n-row; spaces++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int spaces = 1; spaces < row; spaces++){
            System.out.print(" ");
        }
        for(int col = n; col>=1; col--){
            System.out.print("* ");
        }
        for(int spaces = 1; spaces < row; spaces++){
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
