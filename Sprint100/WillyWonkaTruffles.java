import java.util.Scanner;

public class WillyWonkaTruffles {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // scanner.close();
        int N=3;
        
        System.out.println(countWays(N));
    }

    private static int countWays(int N) {
        if (N == 1) return 1;
        if (N == 2) return 2;
        
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
