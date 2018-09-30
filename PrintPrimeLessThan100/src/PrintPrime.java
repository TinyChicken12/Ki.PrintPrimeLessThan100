import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Check a number <100 is Prime or Not");
        System.out.println("Enter a number <100:");
        number = sc.nextInt();
        if (number < 100) {
            if (number < 2)
                System.out.println("The number is not prime");
            else {
                int count = 0;
                for (int x = 2; x <= Math.sqrt(number); x++) {
                    if (number % x == 0) {
                        count = count + 1;
                    }
                }
                if (count > 0) System.out.println("The number is not prime");
                else System.out.println(number + " is a Prime ");
            }
        } else
            System.out.println("Invalid range!");
    }
}
