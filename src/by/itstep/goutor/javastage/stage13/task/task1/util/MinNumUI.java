package by.itstep.goutor.javastage.stage13.task.task1.util;

public class MinNumUI {
    public static String getMinNumUI(int minNum) {

        String msg = "\nMinimal number of sequence is: ";

        return minNum < 0 ? "\nError" : msg + minNum;
    }
}
