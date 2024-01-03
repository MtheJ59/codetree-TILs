import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int scoreA = sc.nextInt();
        int scoreB = sc.nextInt();

        if (scoreA >= 90) {
            if (scoreB >= 95) {
                System.out.println("100000");
            } else if (scoreB >= 90) {
                System.out.println("50000");
            } return;
            } else {
                System.out.println("0");
        }
    }
}