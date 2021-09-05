import java.util.Scanner;

public class uri_1183 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.next();
            double total = 0.0;
            double count = 0.0;
            double[][] array = new double[12][12];
            // input in array
            for (int i = 0; i < args.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = scanner.nextDouble();
                    if (i < j) {
                        total += array[i][j];
                        count++;
                    }
                }
            }
            // checking input for action
            if (s.equals("S")) {
                System.out.println(String.format("%.1f", total));
            } else if (s.equals("M")) {
                total /= count;
                System.out.println(String.format("%.1f", total));
            }
        }

    }
}
