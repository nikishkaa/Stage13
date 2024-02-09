package by.itstep.goutor.javastage.stage13.task.task7.controller;

import by.itstep.goutor.javastage.stage13.task.task7.model.logic.ExamResultCalc;
import by.itstep.goutor.javastage.stage13.task.task7.util.TestArray;
import by.itstep.goutor.javastage.stage13.util.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getUserArrayNumber();

        double[] examResult = ExamResultCalc.getExamResult(numbers);


        Printer.print(Arrays.toString(examResult));
    }
}
