package by.itstep.goutor.javastage.stage13.task.task6.util;

import by.itstep.goutor.javastage.stage13.util.view.Printer;

import java.util.Scanner;

public class TestArray {

    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int[] getUserArrayNumber() {

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {

            Printer.print("Enter " + (i + 1) + " array number: ");
            numbers[i] = SCANNER.nextInt();

        }

        return numbers;
    }
}
