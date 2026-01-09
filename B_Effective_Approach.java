import java.util.*;

public class B_Effective_Approach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> position = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            position.put(arr[i], i + 1);
        }

        int m = scanner.nextInt();
        long vasya = 0;
        long petya = 0;

        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            int pos = position.get(q);
            vasya += pos;           
            petya += (n - pos + 1); 
        }

        System.out.println(vasya + " " + petya);
        scanner.close();
    }
}
