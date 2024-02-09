package by.itstep.goutor.javastage.stage13.task.task3.util;

public class UserUI {
    public static String getUserUI(boolean ordered) {

        String msg = "\nNumbers in your vector arranged in ";

        return ordered ? msg + "ascending order" : msg + "descending order";
    }
}
