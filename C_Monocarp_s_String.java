import java.io.*;
import java.util.*;

public class C_Monocarp_s_String {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = fs.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();

        String str = fs.next();

        StringBuilder s = new StringBuilder(str);

        int a = 0;
        int b = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                a++;
            } else {
                b++;
            }
        }
        int count = 0;
        boolean flag = false;
        if (a == b) {
            System.out.println(0);
            flag = true;
        } else {
            while (a != b) {
                if (a > b) {
                    s.deleteCharAt(0);
                    a--;
                    count++;
                } else {
                    s.deleteCharAt(0);
                    b--;
                    count++;
                }

                if (a == 0 && b > 0 || b == 0 && a > 0) {
                    System.out.println(-1);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println(count);
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