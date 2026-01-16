import java.io.*;
import java.util.*;

public class A_HQ_9 {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        String str = fs.next();
        boolean print = true;
        for (char c : str.toCharArray()) {
            if (c == 'H') {
                System.out.println("YES");
                print = false;
                break;
            } else if (c == 'Q') {
                System.out.println("YES");
                print = false;
                break;
            } else if (c == '9') {
                System.out.println("YES");
                print = false;
                break;
            }
        }
        if (print) {
            System.out.println("NO");
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