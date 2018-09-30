import java.util.Scanner;

public class Print10FirstPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N = 2;
        int tag = 0;

        while (count < 20) {
            tag = 0;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    tag++;
                }
            }
            if (tag == 0) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}