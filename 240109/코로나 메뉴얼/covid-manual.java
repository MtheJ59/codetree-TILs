import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String c1 = sc.next();
        int m1 = sc.nextInt();
        String c2 = sc.next();
        int m2 = sc.nextInt();
        String c3 = sc.next();
        int m3 = sc.nextInt();
        
        if (c1.equals("Y") || c2.equals("Y") || c3.equals("Y")) {
            if ((m1 >= 37 && m2 >= 37) || (m1 >= 37 && m3 >= 37)) {
                System.out.println("E");
            } else if ((m2 >= 37 && m3 >= 37) || (m2 >= 37 && m1 >= 37)) {
                System.out.println("E");
            }
        }  else {
                System.out.println("N");
            }
        
    }
}