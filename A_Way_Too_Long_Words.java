import java.util.Scanner;

public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {

            String word = scanner.next();

            StringBuilder ans = new StringBuilder();
            if (word.length() > 10) {
                char[] ch = word.toCharArray();
                ans.append(ch[0]);
                ans.append(word.length() - 2);
                ans.append(ch[word.length() - 1]);
            } else {
                ans.append(word);
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}