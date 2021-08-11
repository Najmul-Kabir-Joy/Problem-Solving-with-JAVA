import java.util.Scanner;

public class right_sided_triangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter pattern size: ");
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
