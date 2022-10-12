package homework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("ошибок не обнаружено");
        }
        else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }

        String yourPassword = scanner.next();
        int passwordLength = yourPassword.length();
        char lastSymbol = yourPassword.charAt(passwordLength - 1);
        char checkSymbol = '!';
        if (lastSymbol != checkSymbol) {
            if (6 > passwordLength) {
                System.out.println("Ваш пароль неверный");
            }
            else {
                System.out.println("пароль принят");
            }
        }
        else {
            System.out.println("пароль принят");
        }
    }
}

