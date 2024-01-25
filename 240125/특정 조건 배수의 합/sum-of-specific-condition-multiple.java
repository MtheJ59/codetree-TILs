import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
       
       for (int i = a; i <= b; i++) {
        if (i % 5 == 0) {
            count1 += i;
        }
        for (int j = a; j >= b; j--) {
            if (i % 5 == 0) {
                count2 += j;
            }
        }
       count3 = count1 + count2;
       }
       System.out.print(count3);
    }
}