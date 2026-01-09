import java.io.*;
import java.util.*;

public class D_Inversion_Value_of_a_Permutation {
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
        int k = fs.nextInt();

        int maxK = n * (n - 1) / 2;
        if (k > maxK) {
            System.out.println(0);

        }

        ArrayList<Integer> res = new ArrayList<>();
        int left = 1, right = n;

        for (int i = 0; i < n; i++) {
            int remaining = n - i - 1; // max inversions if we put largest at front
            if (k >= remaining) {
                res.add(right); // place largest at back
                k -= remaining;
                right--;
            } else {
                res.add(0, left); // place smallest at front
                left++;
            }
        }

        // Print the result
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + (i == res.size() - 1 ? "\n" : " "));
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