import java.util.Scanner;

public class MilesToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kilometers?");
        int userInput2 = scanner.nextInt();
        double miles = userInput2*0.62137;
        System.out.println(miles+" miles");

    }
}
