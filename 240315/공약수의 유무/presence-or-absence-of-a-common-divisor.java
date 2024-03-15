import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean ab = false;
        boolean bb = false;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                ab = true;
            }
        }
        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
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