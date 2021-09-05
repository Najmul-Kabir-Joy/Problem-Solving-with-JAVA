import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter pattern size: ");
            int n = input.nextInt();
            int spaces = 2 * n - 1;
            int stars = 0;
            for (int i = 1; i <= 2 * n - 1; i++) {
                if (i <= n) {
                    spaces -= 2;
                    stars++;
                } else {
                    spaces += 2;
                    stars--;
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print('*');
                }
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= stars; j++) {
                    if (j != n) {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
    }
}
