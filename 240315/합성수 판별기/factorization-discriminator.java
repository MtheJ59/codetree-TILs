import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean b = false;

        for (int i = 2; i < n; i++) { // n 자신을 제외한 수로 나눈다.
            if (n % i == 0) {
                b = true;
                break; // 합성수로 판별되어 더 이상 검사할 필요가 없으므로 루프를 종료.
            }
        }
            if (b == true) {
                System.out.print("C");
            } else {
                System.out.print("N");
            }
    }
}