import java.util.Scanner;

class User {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sca.nextLine();
        System.out.printf("hey %s, How are you ?", name);
        String status = sca.nextLine();
        System.out.println("what is your age?");
        int age = sca.nextInt();
        System.out.println("thank you for the information");
        sca.close();
    }
}