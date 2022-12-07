import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth...");
        String string = scanner.nextLine();
        System.out.println("Your input: " + string);
        System.out.println("Enter a number...");
        long number = Long.parseLong(scanner.nextLine());
        System.out.println("Your input: " + number);
    }
}
