package by.itstep.goutor.javastage.stage13.task.task1.model.logic;

public class ArithmeticMean {
    public static final int ERROR = -1;

    public static double getArithmeticMeans(int[] numbers) {


        for (int number : numbers) {
            if (number < 0) {
                return ERROR;
            }
        }


        double arithmeticMeans = 0;

        int count = 0;

        for (; count < numbers.length; count++) {
            arithmeticMeans += numbers[count];
        }

        arithmeticMeans = arithmeticMeans / count;

        return arithmeticMeans;
    }
}
