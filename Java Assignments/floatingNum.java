
import java.util.Scanner;

class Float {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the number");
        Double Num = sca.nextDouble();
        if (Num > 0) {
            if (Num < 1) {
                System.out.println("Positive small number");
            } else if (Num > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
            if (Num == 0) {
                System.out.println("given number is zero");
            } else if (Num < 0) {
                System.out.println("given number is nagative");
            } else {
                System.out.println("small number");
            }
        }
    }
}