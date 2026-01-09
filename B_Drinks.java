import java.util.Scanner;

public class B_Drinks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < y; i++) {
            sum += scanner.nextDouble();
        }

        double ans = (sum / y);
        System.out.printf("%.12f", ans);
        scanner.close();
    }
}