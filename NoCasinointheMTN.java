package Code_Forces;

import java.util.Scanner;

public class NoCasinointheMTN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;

        int t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();

            int[] days = new int[n];

            for (int i = 0; i < n; i++) {
                days[i] = scanner.nextInt();
            }
            
            int ans = 0; // peak counter
            int count = 0; // day counter

            for (int i = 0; i < n; i++) {
                if (days[i] == 0) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == k) {
                    ans++;
                    count = 0;
                    i++;
                }
            }

            System.out.println(ans);
        }
        scanner.close();
    }
}
