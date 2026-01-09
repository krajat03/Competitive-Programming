import java.util.Scanner;

public class A_Elephant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int steps = (n + 4) / 5;
        System.out.println(steps);
        scanner.close();
    }
}