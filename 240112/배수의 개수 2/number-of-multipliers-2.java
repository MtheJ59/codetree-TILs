import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int a;

        for (int i = 1; i <= 10; i++) {
            a = sc.nextInt();
            if (i % 2 == 1) {
                 cnt++;
            }
        }
       System.out.println(cnt);
    }
}