import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String max = a >= 3000 ? "book" : "mask";

        if (a >= 3000) {
            System.out.println(max);
        } else if (a >= 1000) {
            System.out.println(max);
        } else {
            System.out.println("no");
        }
    }
}