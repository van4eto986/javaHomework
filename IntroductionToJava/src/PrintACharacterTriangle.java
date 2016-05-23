import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows on Triangle: ");
        Integer number= scan.nextInt();
        triangle(number);
    }
    private static void triangle(Integer number) {
        upperRows(number);
        lowerRows(number);
    }
    private static void lowerRows(Integer number) {
        for (int i = number - 1; i > 0 ; i--) {
            printTriangleLine(i);
        }
    }
    private static void upperRows(Integer number) {
        for (int i = 1; i <= number; i++) {
            printTriangleLine(i);
        }
    }
    private static void printTriangleLine(int i) {
        for (char c = 'a'; c < 'a' + i ; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

