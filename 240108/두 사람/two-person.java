import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        String genA = sc.next();
        int ageB = sc.nextInt();
        String genB = sc.next();

    

       if ((ageA >= 19 && genA.equals("M")) || (ageB >= 19 && genB.equals("M"))) {
        System.out.print("1");
       } else if ((ageA >= 19 && genA.equals("W")) || (ageB >= 19 && genB.equals("M"))){
            System.out.print("1");
        } else if ((ageA >= 19 && genA.equals("M")) || (ageB >= 19 && genB.equals("W"))){
            System.out.print("1");
        } else if ((ageA >= 19 && genA.equals("M")) || (ageB < 19 && genB.equals("W"))){
            System.out.print("1");
        } else if ((ageA < 19 && genA.equals("W")) || (ageB >= 19 && genB.equals("M"))){
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }

}
}