import java.util.Scanner;

public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        Integer number = scan.nextInt();
        Integer sum = 0;
        for (int i = 1; i <= number ; i++) {
            sum+=i;
        }
        System.out.print(sum);
    }
}
