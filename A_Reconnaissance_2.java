import java.io.*;
import java.util.*;

public class A_Reconnaissance_2 {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int x = fs.nextInt();
        int[] arr = new int[x];

        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < x; i++) {
            arr[i] = fs.nextInt();

        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (min > diff) {
                min = diff;
                idx1 = i + 1;
                idx2 = i + 2;
            }
        }

        if (min > Math.abs(arr[x - 1] - arr[0])) {
            min = Math.abs(arr[x - 1] - arr[0]);
            idx1 = x;
            idx2 = 1;
        }
        System.out.println(idx1 + " " + idx2);
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