import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int Num1 = sca.nextInt();
        System.out.println("enter the 2nd number");
        int Num2 = sca.nextInt();
        System.err.println(Num1 + " x " + Num2 + " = " + Num1 * Num2);
    }
}