package homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        //First Level #1
        Scanner scanner = new Scanner(System.in);
        String randomString = scanner.nextLine();
        int randomStringSize = randomString.length();
        boolean answer = randomStringSize > 10;
        System.out.println(answer);

        //First Level #2
        char firstSymbol = randomString.charAt(0);
        char lastSymbol = randomString.charAt(randomString.length() - 1);
        boolean firstAndLastSymbolsAreEqual = firstSymbol == lastSymbol;
        System.out.println(firstAndLastSymbolsAreEqual);

        //Second Level
        String abbaString = scanner.nextLine();
        abbaString = abbaString.toUpperCase()
                .replace('A', 'X')
                .replace('B', 'A')
                .replace('X', 'B');

        System.out.println(abbaString);
    }
}
