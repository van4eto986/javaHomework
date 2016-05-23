import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print(Integer.toString(number, 7));
    }
}
