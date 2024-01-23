import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int classRoom = 0;
        int classLoad = 0;
        int restRoom = 0;
        
        for (int i = 1; i <= n; i++) {
                if (i % 12 == 0) {
                    restRoom += 1;
                }
                else if (i % 3 == 0) {
                    classLoad += 1;
                }
                else if (i % 2 == 0) {
                    classRoom += 1;
                }
            }
        
        System.out.print(classRoom + " " + classLoad + " " + restRoom);
    }
}