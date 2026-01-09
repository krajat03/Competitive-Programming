import java.util.Scanner;

public class A_Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int ans = 0;

        while (t-- > 0) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                int openion = scanner.nextInt();
                if (openion == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}