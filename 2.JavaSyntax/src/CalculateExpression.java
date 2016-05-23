import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double c = scan.nextFloat();

        double firstNumber = ((a * a) + (b * b)) / ((a * a) - (b * b));
        double firstPower = (a + b + c) / Math.sqrt(c);
        double firstResult = Math.pow(firstNumber,firstPower);

        double secondNumber = (a * a) + (b * b) - (c * c * c);
        double secondPower = a - b;
        double secondResult = Math.pow(secondNumber,secondPower);

        double diff = Math.abs((a + b + c) / 3 - (firstResult + secondResult) / 2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstResult, secondResult, diff);
    }
}
