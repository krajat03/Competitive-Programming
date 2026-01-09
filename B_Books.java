import java.util.Scanner;

public class B_Books {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int book = scanner.nextInt();
        int time = scanner.nextInt();

        int[] books = new int[book];
        for (int i = 0; i < book; i++) {
            books[i] = scanner.nextInt();
        }

        int count = 0;
        int max = 0;

        int i = 0;
        int idx = 0;
        while (i < book) {
            while (time > 0) {
                time -= books[idx++];
                count++;
            }
            i++;
            max = Math.max(max, count);
        }

        System.out.println(max);
        scanner.close();
    }
}