import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        // upper triangle
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter pattern size: ");
            int n = input.nextInt();
            for (int i = 1; i <= n - 1; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
            // lower triangle
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("* ");
                }

                for (int j = i; j < n - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
