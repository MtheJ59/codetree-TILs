import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1;

        while (true) {
            if (n / 2 == 1) {
                break;
            } else {
                x++;
                n = n / 2;
            }
            System.out.print(x);
        }
    }
}