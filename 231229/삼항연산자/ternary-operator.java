import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String score = a == 100 ? "pass" : "failure";

        if (a == 100) {
            System.out.println(score);
        } else {
            System.out.println(score);
        }
    }
}