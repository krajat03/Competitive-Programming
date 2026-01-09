import java.util.Scanner;

public class B_Blackslex_and_Showering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            long totalTime = 0;
            // Compute total time without skipping
            for (int i = 1; i < n; i++) {
                totalTime += Math.abs(a[i] - a[i - 1]);
            }

            long maxReduction = 0;
            // Try removing each middle floor to find maximum reduction
            for (int i = 1; i < n - 1; i++) {
                long reduction = Math.abs(a[i] - a[i - 1]) 
                               + Math.abs(a[i + 1] - a[i]) 
                               - Math.abs(a[i + 1] - a[i - 1]);
                if (reduction > maxReduction) {
                    maxReduction = reduction;
                }
            }

            long minTime = totalTime - maxReduction;
            System.out.println(minTime);
        }

        scanner.close();
    }
}