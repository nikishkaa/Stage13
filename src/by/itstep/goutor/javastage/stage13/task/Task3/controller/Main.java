package by.itstep.goutor.javastage.stage13.task.Task3.controller;

import by.itstep.goutor.javastage.stage13.task.Task3.model.logic.NumbersLogic;
import by.itstep.goutor.javastage.stage13.task.Task3.util.TestArray;
import by.itstep.goutor.javastage.stage13.task.Task3.util.UserUI;
import by.itstep.goutor.javastage.stage13.util.view.Printer;


public class Main {
    public static void main(String[] args) {
        int[] numbers = TestArray.getUserArrayNumber();

        boolean ordered = NumbersLogic.getOrderedNumbers(numbers);


        Printer.print(UserUI.getUserUI(ordered));
    }
}
