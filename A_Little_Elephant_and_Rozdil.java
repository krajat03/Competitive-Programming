import java.io.*;
import java.util.*;

public class A_Little_Elephant_and_Rozdil {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();
        long minTime = Long.MAX_VALUE;
        int countMin = 0;
        int index = -1;

        for (int i = 1; i <= n; i++) {
            long time = fs.nextLong();

            if (time < minTime) {
                minTime = time;
                countMin = 1;
                index = i;
            } else if (time == minTime) {
                countMin++;
            }
        }

        if (countMin > 1) {
            System.out.println("Still Rozdil");
        } else {
            System.out.println(index);
        }
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