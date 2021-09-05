import java.util.Scanner;

public class uri_1186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        double[][] array = new double[12][12];
        double total = 0.0;
        double count = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextDouble();
                if (j < array.length - i - 1) {
                    total += array[i][j];
                    count++;
                }
            }
        }
        if (s.equals("S")) {
            System.out.println(String.format("%.1f", total));
        } else if (s.equals("M")) {
            total /= count;
            System.out.println(String.format("%.1f", total));
        }
    }
}
