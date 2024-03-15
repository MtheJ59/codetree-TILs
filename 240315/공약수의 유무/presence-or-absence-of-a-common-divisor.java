import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] hap = new int[1920];
        int index = 0;

        for (int i = 1; i <= 1920; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                hap[index] = i;
                index++;
            }
        }

        boolean bl = false;
        for (int j = 0; j < index; j++) {
            if (hap[j] >= a && hap[j] <= b) {
                bl = true;
                break;
            }
        }

        if (bl) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}