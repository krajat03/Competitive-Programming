import java.io.*;
import java.util.*;

public class A_Beautiful_Matrix {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int row = 0, col = 0;
        boolean found = false;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int x = fs.nextInt();
                if (x == 1) {
                    row = i;
                    col = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        int moves = Math.abs(row - 3) + Math.abs(col - 3);
        System.out.println(moves);

        out.close();
    }

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