import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number ");
        int first = scanner.nextInt();
        System.out.println("Second number ");
        int second = scanner.nextInt();

        if (first > second){
            System.out.println("The second number should be bigger");
        } else if (first < second) {
            for (int i = first; i < second; i++)
                System.out.println(i);
        }

    }

}
