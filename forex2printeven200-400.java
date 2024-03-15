import java.util.Scanner;

class User {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sca.nextInt();
        System.out.println("second number");
        int num1 = sca.nextInt();

        for (int i = num; i < num1; i++) {
            if (i % 2 == 0)

                System.out.println(i);
        }
        sca.close();
    }
}