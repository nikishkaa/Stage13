package by.itstep.goutor.javastage.stage13.task.task6.util;

public class MirrorArraysUI {
    public static StringBuilder getMirrorNumbersUI(boolean mirror) {

        StringBuilder builder = new StringBuilder();

        String msg = "Number in array ";


        return mirror ? builder.append(msg).append("mirror")
                : builder.append(msg).append("not mirror");
    }
}
