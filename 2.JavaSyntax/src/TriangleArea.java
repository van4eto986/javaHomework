import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int area = ((a1 * (b2 - c2)) + (b1 * (c2 - a2)) + (c1 * (a2 - b2))) / 2;
        System.out.println(Math.abs(area));
    }
}