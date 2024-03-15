import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the marks");
        int marks = scan.nextInt();
        if (marks < 35) {
            System.out.println("student is failed");
        } else if (marks == 35) {
            System.out.println("student just passed");
        } else if (marks > 35 && marks < 75) {
            System.out.println("student is second class");
        } else if (marks >= 75 && marks < 85) {
            System.out.println("student is first class");
        } else {
            System.out.println("student is distinction");
        }

        scan.close();
    }
}