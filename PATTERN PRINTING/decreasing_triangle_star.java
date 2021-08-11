import java.util.Scanner;

public class decreasing_triangle_star {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
