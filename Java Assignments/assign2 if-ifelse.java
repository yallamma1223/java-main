import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the day");
        String days = scan.nextLine();
        if (days.equals("monday") ||
                days.equals("tuesday") ||
                days.equals("wednesday") ||
                days.equals("thursday") ||
                days.equals("friday")) {
            System.out.println("ops its weekday");
        } else if (days.equals("saturday") ||
                days.equals("sunday")) {
            System.out.println("yeah its weekend");
        }

        scan.close();
    }
}
