import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Binary to Decimal calculator Program\n");
        System.out.println("Enter binary number value: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println("You entered: " + buffer + " for conversion.\n");
        int decimal =  Binary2decimal(buffer);
        System.out.println("Decimal value of binary " + buffer + " is " + decimal);
    }

    private static int Binary2decimal(String binary) {
        int result = 0; // Temporarily holds result
        for(int i = 0; i < binary.length(); i++)
        {
            int digit = Character.getNumericValue(binary.charAt(i));
            int position = binary.length() - i -1;
            result += digit * Math.pow(2, position);
        }

        return result;
    }

}
