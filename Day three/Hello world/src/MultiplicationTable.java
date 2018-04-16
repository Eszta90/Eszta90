import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        int a = 0;
        while (a <= 9) {
            a += 1;
            int result = a*userInput1;
            System.out.println(a +" * "+ userInput1 +" = "+ result );

        }
    }
}




