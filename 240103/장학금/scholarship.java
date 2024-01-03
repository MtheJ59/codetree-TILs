import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int scoreA = sc.nextInt();
        int scoreB = sc.nextInt();
        int pass = 0;

        if (scoreA >= 90) {
         pass = 1;
        } else {
            pass = 0;
        }
        if (pass == 1 && scoreB >= 95) {
            System.out.println("100000");
        } else if (pass == 1 && scoreB >= 90) {
            System.out.println("50000");
        } else {
            System.out.println("0");
        }
        
    }
}