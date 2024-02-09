package by.itstep.goutor.javastage.stage13.task.task7.controller;

import by.itstep.goutor.javastage.stage13.task.task7.model.logic.ExamResultCalc;
import by.itstep.goutor.javastage.stage13.task.task7.util.ExamResultUI;
import by.itstep.goutor.javastage.stage13.task.task7.util.PrintStringBuilder;
import by.itstep.goutor.javastage.stage13.task.task7.util.TestArray;

public class Main {
    public static void main(String[] args) {

        int[] numbers = TestArray.getUserArrayNumber();

        double[] examResult = ExamResultCalc.getExamResult(numbers);


        PrintStringBuilder.print(ExamResultUI.getExamResultUI(examResult));
    }
}
