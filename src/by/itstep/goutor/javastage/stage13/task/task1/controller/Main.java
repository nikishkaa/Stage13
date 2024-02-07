package by.itstep.goutor.javastage.stage13.task.task1.controller;

import by.itstep.goutor.javastage.stage13.task.task1.model.logic.MaxNumLogic;
import by.itstep.goutor.javastage.stage13.task.task1.util.MaxNumUI;
import by.itstep.goutor.javastage.stage13.util.randominitializearray.RandomInitializeNumber;
import by.itstep.goutor.javastage.stage13.util.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = RandomInitializeNumber.getRandomArrayNumber();

        int maxNum = MaxNumLogic.getMaxNumber(numbers);


        Printer.print("Original array of numbers: " + Arrays.toString(numbers));

        Printer.print(MaxNumUI.getMaxNUmberUI(maxNum));


    }
}
