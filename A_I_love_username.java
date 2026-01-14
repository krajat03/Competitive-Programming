import java.io.*;
import java.util.*;

public class A_I_love_username {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = fs.nextInt();
        int count = 0;
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = fs.nextInt();
        }

        int best = arr[0];
        int worst = arr[0];

        for (int i = 1; i < t; i++) {
            if (arr[i] > best) {
                count++;
                best = arr[i];
            }
            else if (arr[i] < worst) {
                count++;
                worst = arr[i];
            }
        }
        System.out.println(count);
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