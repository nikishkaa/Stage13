package by.itstep.goutor.javastage.stage13.task.task1.model.logic;

public class ArithmeticMean {
    public static final int ERROR = -1;

    public static double getArithmeticMeans(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return ERROR;
            }
        }


        double arithmeticMeans = 0;

        int i = 0;

        for (; i < numbers.length; i++) {
            arithmeticMeans += numbers[i];
        }

        arithmeticMeans = arithmeticMeans / i;

        return arithmeticMeans;
    }
}
