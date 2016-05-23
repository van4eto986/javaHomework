import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the a base-7 number : ");
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        try {
            int decimalNumber = Integer.valueOf(number, 7);
            System.out.println(decimalNumber);
        }catch (NumberFormatException e) {
            System.out.println("You have entered an invalid number");
        }
    }
}
