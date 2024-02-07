package by.itstep.goutor.javastage.stage13.task.task1.util;

public class NumUI {
    public static String getMaxNUmberUI(int maxNumber) {
        String msg = "\nbiggest number of sequence is: ";

        return maxNumber < 0 ? "\nError" : msg + maxNumber;
    }
}
