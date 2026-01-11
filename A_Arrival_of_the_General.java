import java.io.*;
import java.util.*;

public class A_Arrival_of_the_General {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = fs.nextInt();
        int[] sol = new int[t];

        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        int min = Integer.MAX_VALUE;
        int minIdx = -1;

        for (int i = 0; i < t; i++) {
            sol[i] = fs.nextInt();
            if (max < sol[i]) {
                max = sol[i];
                maxIdx = i;
            }
            if (min >= sol[i]) {
                min = sol[i];
                minIdx = i;
            }
        }
        int moves = maxIdx + (t - 1 - minIdx);
        if (maxIdx > minIdx) {
            moves--;
        }
        System.out.println(moves);
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