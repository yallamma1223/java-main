import java.util.Scanner;

class Great {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int Num = sca.nextInt();
        System.out.println("enter the 2nd number");
        int Num1 = sca.nextInt();
        System.out.println("enter the 3rd number");
        int Num2 = sca.nextInt();
        if (Num > Num1) {
            if (Num > Num2)
                System.out.println("greatest number " + Num);

        }
        if (Num1 > Num) {
            if (Num1 > Num2)
                System.out.println("greatest number " + Num1);

        }
        if (Num2 > Num1) {
            if (Num2 > Num)
                System.out.println("greatest number " + Num2);

        }
    }
}