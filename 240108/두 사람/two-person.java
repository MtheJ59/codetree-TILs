import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        String genA = sc.nextLine();
        int ageB = sc.nextInt();
        String genB = sc.nextLine();

    

       if (ageA >= 19 && genA == "M" || ageB >= 19 && genB == "M") {
            System.out.println("1");
        } else if (ageA < 19 && genA != "M" || ageB >= 19 && genB == "M") {
            System.out.println("1");
        } else if (ageB <19 && genB != "M" || ageA >= 19 && genA == "M") {
            System.out.println("1");
        } else if (ageA >= 19 && genA != "M" || ageB >= 19 && genB == "M") {
            System.out.println("1");
        } else if (ageB >= 19 && genB != "M" || ageA >= 19 && genA == "M") {
            System.out.println("1");
        }

        else {
            System.out.println("0");
        }

}
}