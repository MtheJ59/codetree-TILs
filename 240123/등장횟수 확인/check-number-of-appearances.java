import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        
        int count = 0;
        
        for (int i = 1; i < 6; i++) {
            int n = sc.nextInt();
             if (n % 2 == 0) {
                count += 1;
            }
        }
           
         System.out.print(count);
       
    }
}