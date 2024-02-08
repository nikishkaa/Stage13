package by.itstep.goutor.javastage.stage13.task.task5.util;

public class SameNumbersUI {
    public static String getSameUI(boolean same) {

        String msg = "Numbers in your array is ";

        return same ? msg + "same" : msg + "different";
    }
}
