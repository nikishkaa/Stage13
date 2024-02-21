package by.itstep.goutor.javastage.stage13.task.task7.model.logic;


public class ExamResultCalc {
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 5;


    public static double[] getExamResult(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return new double[0];
        }


        for (int number : numbers) {

            if (number < MIN_MARK || number > MAX_MARK) {
                return new double[0];
            }

        }


        double[] examResult = calculateCountMark(numbers);


        for (int i = 0; i < examResult.length; i++) {
            examResult[i] = (examResult[i] / numbers.length) * 100;
        }


        return examResult;
    }


    private static double[] calculateCountMark(int[] numbers) {

        double[] examMarkCount = new double[6];

        for (int number : numbers) {
            if (number == 0) {
                examMarkCount[0]++;
            } else if (number == 1) {
                examMarkCount[1]++;
            } else if (number == 2) {
                examMarkCount[2]++;
            } else if (number == 3) {
                examMarkCount[3]++;
            } else if (number == 4) {
                examMarkCount[4]++;
            } else
                examMarkCount[5]++;


        }

        return examMarkCount;
    }
}