import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prod = 0;
        float d = n;

        for (int i = 1; i <= n; i++) {
            d /= i;
            prod++;
            if (d <= 1) {
                System.out.print(prod);
                break;
            } else {
                continue;
            }
        }
    }
}