package by.itstep.goutor.javastage.stage13.task.task6.controller;

import by.itstep.goutor.javastage.stage13.task.task6.model.logic.MirrorNumberLogic;
import by.itstep.goutor.javastage.stage13.task.task6.util.MirrorArraysUI;
import by.itstep.goutor.javastage.stage13.task.task6.util.PrintStringBuilder;
import by.itstep.goutor.javastage.stage13.task.task6.util.TestArray;

public class Main {
    public static void main(String[] args) {
        int[] numbers = TestArray.getUserArrayNumber();

        boolean mirror = MirrorNumberLogic.getMirrorNumberLogic(numbers);

        PrintStringBuilder.print(MirrorArraysUI.getMirrorNumbersUI(mirror));


    }
}
