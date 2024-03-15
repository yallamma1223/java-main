import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int Num = scanner.nextInt();
        System.out.println("enter the first number");
        int Num1 = scanner.nextInt();
        for (int i = Num; i < Num1; i++) {
            if (i % 7 == 0)

                System.out.println(i);
        }
        scanner.close();
    }
}