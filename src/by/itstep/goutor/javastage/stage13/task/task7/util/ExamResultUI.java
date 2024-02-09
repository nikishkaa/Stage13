package by.itstep.goutor.javastage.stage13.task.task7.util;


public class ExamResultUI {
    public static double ZERO_PERCENT = 0;
    public static double ONE_PERCENT = 0;
    public static double TWO_PERCENT = 0;
    public static double THREE_PERCENT = 0;
    public static double FOUR_PERCENT = 0;
    public static double FIVE_PERCENT = 0;

    public static StringBuilder getExamResultUI(double[] examResult) {

        StringBuilder builder = new StringBuilder();

        if (examResult.length == 0) {
    return builder.append("Invalid marks.");
        }

        int count = 0;

        ZERO_PERCENT = examResult[count++];
        ONE_PERCENT = examResult[count++];
        TWO_PERCENT = examResult[count++];
        THREE_PERCENT = examResult[count++];
        FOUR_PERCENT = examResult[count++];
        FIVE_PERCENT = examResult[count];



        return builder.append("Exam result: ")
                .append("\nfives-").append(FIVE_PERCENT).append(" %")
                .append("\nfour- ").append(FOUR_PERCENT).append(" %")
                .append("\nthree- ").append(THREE_PERCENT).append(" %")
                .append("\ntwo- ").append(TWO_PERCENT).append(" %")
                .append("\none- ").append(ONE_PERCENT).append(" %")
                .append("\nzero- ").append(ZERO_PERCENT).append(" %");
    }

}
