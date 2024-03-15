import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the the first number");
        int number1 = scan.nextInt();
        System.out.println("enter the the second number");
        int number2 = scan.nextInt();
        System.out.println("enter the requred operations");
        String operation = scan.next();
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "%":
                result = number1 % number2;
                break;
            default:
                System.out.println("invalid operations");
                break;
        }
        System.out.println(result);
        scan.close();
    }
}