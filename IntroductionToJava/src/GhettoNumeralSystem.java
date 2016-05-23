import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number:");
        Integer number = scan.nextInt();
        String convertedNumber = convertingNumberToGhetto(number);
        System.out.println(convertedNumber);
    }
    private static String convertingNumberToGhetto(Integer number) {
        String numberAsString = number.toString();
        StringBuilder ghettoNumber = new StringBuilder();
        for (int i = 0; i < numberAsString.length() ; i++) {
            ghettoNumber.append(convertDigitInGhetto(numberAsString.charAt(i)));
        }
        return ghettoNumber.toString();
    }
    private static String convertDigitInGhetto(char digit) {
        String ghettoDigit = " ";
        switch (digit) {
            case '0': ghettoDigit = "Gee";
                break;
            case '1':  ghettoDigit ="Bro";
                break;
            case '2': ghettoDigit = "Zuz";
                break;
            case '3': ghettoDigit ="Ma";
                break;
            case '4': ghettoDigit ="Duh";
                break;
            case '5': ghettoDigit = "Yo";
                break;
            case '6': ghettoDigit = "Dis";
                break;
            case '7': ghettoDigit = "Hood";
                break;
            case '8': ghettoDigit ="Jam";
                break;
            case '9': ghettoDigit = "Mack";
                break;
            default: System.out.println("You cannot convert this number even in ghetto numeral.");
                break;
        }
        return ghettoDigit;
    }
}

