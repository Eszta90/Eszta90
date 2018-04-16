import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        if (userInput1 < 0) {
            System.out.println("Not enough");
        } else if (userInput1 == (1))  {
            System.out.println("1");
        } else if (userInput1 == 2) {
            System.out.println("2");
        } else {
            System.out.println("A lot!");
        }
    }
}




