package by.itstep.goutor.javastage.stage13.task.task1.controller;

import by.itstep.goutor.javastage.stage13.task.task1.model.logic.NumLogic;
import by.itstep.goutor.javastage.stage13.task.task1.util.NumUI;
import by.itstep.goutor.javastage.stage13.util.randominitializearray.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage13.util.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int maxNum = NumLogic.getMaxNumber(numbers);


        Printer.print("Original array of numbers: " + Arrays.toString(numbers));

        Printer.print(NumUI.getMaxNUmberUI(maxNum));


    }
}
