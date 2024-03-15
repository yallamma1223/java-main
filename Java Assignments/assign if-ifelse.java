//VARIFY WHETHER THE NUMBER IS EVEN OR ODD

import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.err.println("please enter the number");
        int Number = sca.nextInt();

        if (Number % 2 == 0) {
            System.out.println("the given number is even");
        } else {
            System.out.println("givrn number is odd");
        }
        sca.close();
    }
}