import java.util.Scanner;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bear = scanner.nextInt();
        int bob = scanner.nextInt();

        int count = 0;
        while (bear <= bob) {
            bear *= 3;
            bob *= 2;
            count++;
        }
        System.out.println(count);

        scanner.close();
    }
}