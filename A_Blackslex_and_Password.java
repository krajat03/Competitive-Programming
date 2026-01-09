import java.util.Scanner;

public class A_Blackslex_and_Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int x = scanner.nextInt();

            int ans = k * x + 1;
            System.out.println(ans);
        }

        scanner.close();
    }
}