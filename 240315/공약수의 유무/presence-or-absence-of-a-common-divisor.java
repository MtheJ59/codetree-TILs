import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean ab = false;
        boolean bb = false;

        for (int i = a; i <= 1920; i++) {
            if (1920 % i == 0) {
                ab = true;
            }
        }
        for (int j = b; j <= 2880; j++) {
            if (2880 % j == 0) {
                bb = true;
            }
        }

        if (ab == true && bb == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}