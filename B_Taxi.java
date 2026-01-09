import java.util.Scanner;

public class B_Taxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] st = new int[n];
        for (int i = 0; i < n; i++) {
            st[i] = scanner.nextInt();
        }

        int[] count = new int[5];
        for (int i = 0; i < n; i++) {
            count[st[i]]++;
        }

        int taxis = 0;

        taxis += count[4];

        int pair = Math.min(count[3], count[1]);
        taxis += count[3];
        count[1] -= pair;

        taxis += count[2] / 2;
        count[2] %= 2;

        if (count[2] > 0) {
            taxis++;
            count[1] = Math.max(0, count[1] - 2);
        }

        if (count[1] > 0) {
            taxis += (count[1] + 3) / 4;
        }

        System.out.println(taxis);

        scanner.close();
    }
}
