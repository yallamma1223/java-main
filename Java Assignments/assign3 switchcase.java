import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scan.nextInt();
        int reminder = number % 2;
        switch (reminder) {
            case 0:
                System.out.println("given number is even");
                break;
            case 1:
                System.out.println("given number is odd");
                break;
            default:
                break;
        }

    }

}
