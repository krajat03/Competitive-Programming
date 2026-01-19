import java.io.*;
import java.util.*;

public class A_Supercentral_Point {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = fs.nextInt();
            arr[i][1] = fs.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i][0];
            int y = arr[i][1];

            boolean left = false, right = false, up = false, down = false;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                int x2 = arr[j][0];
                int y2 = arr[j][1];

                if (y2 == y && x2 < x)
                    left = true;
                if (y2 == y && x2 > x)
                    right = true;
                if (x2 == x && y2 < y)
                    down = true;
                if (x2 == x && y2 > y)
                    up = true;
            }
            if (left && right && up && down) {
                count++;
            }
        }
        System.out.println(count);
    }

    // FastScanner class for fast input
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                return null;
            }
        }
    }
}