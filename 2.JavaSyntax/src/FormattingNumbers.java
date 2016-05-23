import java.util.Scanner;
public class FormattingNumbers {
    public static void main(String[] args) {
        System.out.println("Write 3 numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        String intHex = Integer.toHexString(a).toUpperCase();
        String intBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.format("|%-10s|%10s|%10.2f|%-10.3f|", intHex, intBinary, b, c);
    }
}
