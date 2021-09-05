import java.util.Scanner;

public class uri_1181 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            String s = scanner.next();
            double[][] array = new double[12][12];
            // input in array
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = scanner.nextDouble();
                }
            }
            double total = 0.0;
            // iterate through array
            for (int i = 0; i < array.length; i++) {
                if (i == n) {
                    for (int j = 0; j < array.length; j++) {
                        total += array[i][j];
                    }
                    break;
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
