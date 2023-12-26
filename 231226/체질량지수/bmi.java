import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = b / ((a*0.01) * (a*0.01));
        int d = (int)c;
        

        if (d >= 25) {
            System.out.println(d);
            System.out.println("Obesity");
        }
    }
}