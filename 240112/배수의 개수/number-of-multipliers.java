import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int cnt2 = 0;
        int a;

        for (int i = 1; i <= 10; i++) {
            a = sc.nextInt();
            if (a % 3 == 0) {
                cnt++;
            } 
            if (a % 5 == 0) {
                cnt2++;
            }
        }
        System.out.print(cnt + " " + cnt2);
    }
}