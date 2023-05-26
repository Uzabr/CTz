package run;

import divide.Divide;
import multiplication.Multiplication;
import plus.Plus;
import subtraction.Subtraction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = Integer.parseInt((str.trim().substring(0,2)));
        int b = Integer.parseInt((str.trim().substring(2)));
        if (a > 10 && b > 10) {
            System.exit(0);
        } else {

            if (str.trim().charAt(2) == Plus.PLUS) {
                System.out.println(Plus.plus(a, b));
            } else if (str.trim().charAt(2) == Divide.DIVIDE) {
                System.out.println(Divide.divide(a, b));
            } else if (str.trim().charAt(2) == Multiplication.MULT) {
                System.out.println(Multiplication.multiple(a, b));
            } else if (str.trim().charAt(2) == Subtraction.SUBTRACT) {
                System.out.println(Subtraction.subtract(a, b));
            }

        }
    }
}