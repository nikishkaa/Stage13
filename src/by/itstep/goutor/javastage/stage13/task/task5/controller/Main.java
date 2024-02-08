package by.itstep.goutor.javastage.stage13.task.task5.controller;

import by.itstep.goutor.javastage.stage13.task.task5.model.logic.NumbersLogic;
import by.itstep.goutor.javastage.stage13.task.task5.util.SameNumbersUI;
import by.itstep.goutor.javastage.stage13.task.task5.util.TestArray;
import by.itstep.goutor.javastage.stage13.util.view.Printer;


public class Main {
    public static void main(String[] args) {
        int[] numbers = TestArray.getUserArrayNumber();

        boolean same = NumbersLogic.getSameNumbers(numbers);


        Printer.print(SameNumbersUI.getSameUI(same));
    }
}
