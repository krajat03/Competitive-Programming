import java.io.*;
import java.util.*;

public class A_Word {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String str = fs.next();
        int n = str.length();

        int upperCount = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperCount++;
            }
        }

        if (upperCount > n - upperCount) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
        out.close();
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