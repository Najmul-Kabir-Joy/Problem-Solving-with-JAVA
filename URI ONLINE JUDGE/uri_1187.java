import java.util.Scanner;

public class uri_1187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        double total = 0.0;
        double count = 0.0;
        int x = 0;
        double[][] array = new double[12][12];
        // taking input
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = x;
                x++;
            }
            x = 0;
        }
        // iterating for result
        for (int i = 1; i < array.length - i; i++) {
            for (int j = i; j < array.length - i; j++) {
                System.out.print(array[i][j] + "-");
                total += array[i][j];
                count++;
            }
            System.out.println();
        }
        // providing final output
        if (s.equals("S")) {
            System.out.println(String.format("%.1f", total));
        } else if (s.equals("M")) {
            total /= count;
            System.out.println(String.format("%.1f", total));
        }
    }
}
