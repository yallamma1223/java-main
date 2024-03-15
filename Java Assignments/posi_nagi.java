import java.util.Scanner;

class Positive {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the number");
        int Num = sca.nextInt();
        if (Num > 0)
            System.out.println("given number is positive");
        else if (Num < 0) {
            System.out.println("given number is nagative");
        } else {
            System.err.println("given number not valid");
        }
    }

}