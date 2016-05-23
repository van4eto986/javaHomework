import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        System.out.println("Enter three numbers : ");
        Double firstNumber = scan.nextDouble();
        Double secondNumber = scan.nextDouble();
        Double threeNumber = scan.nextDouble();
        Double sum =  firstNumber + secondNumber + threeNumber;
        Double average = sum / 3;
        System.out.format("The average number is %.2f \n", average);
    }
}

