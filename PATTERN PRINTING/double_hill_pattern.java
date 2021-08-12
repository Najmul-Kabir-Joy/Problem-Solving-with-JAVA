import java.util.Scanner;

public class double_hill_pattern {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter pattern size: ");
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                // first hill
                for (int j = i; j < n - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                // second hill
                for (int j = i; j < n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();

            }
        }
    }
}
