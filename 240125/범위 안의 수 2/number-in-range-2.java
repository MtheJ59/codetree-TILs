import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int cs = 0;
        float avg;

        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            if (a >= 0 && a <= 200) {
                count += a;
                cs++;
            }
        }
        avg = (float) count / cs;
         System.out.printf("%s %.1f", count, avg);
    }
   
}