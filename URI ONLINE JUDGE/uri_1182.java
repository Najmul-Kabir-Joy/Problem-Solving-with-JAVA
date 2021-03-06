import java.util.Scanner;

public class uri_1182 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            String s = scanner.next();
            double total = scanner.nextDouble();
            double[][] array = new double[12][12];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = scanner.nextDouble();
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (j == n) {
                        total += array[i][j];
                    }
                }
            }

            if (s.equals("S")) {
                System.out.println(String.format("%.1f", total));
            } else if (s.equals("M")) {
                total /= 12.0;
                System.out.println(String.format("%.1f", total));
            }
        }
    }
}
