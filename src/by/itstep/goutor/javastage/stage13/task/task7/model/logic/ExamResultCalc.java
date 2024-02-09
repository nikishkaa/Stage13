package by.itstep.goutor.javastage.stage13.task.task7.model.logic;

public class ExamResultCalc {
    public static double ZERO = 0;
    public static double ONE = 0;
    public static double TWO = 0;
    public static double THREE = 0;
    public static double FOUR = 0;
    public static double FIVE = 0;

    public static double[] getExamResult(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0 || numbers[i] > 5) {
                return new double[0];
            }

        }


        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 0:
                    ZERO++;
                    break;
                case 1:
                    ONE++;
                    break;
                case 2:
                    TWO++;
                    break;
                case 3:
                    THREE++;
                    break;
                case 4:
                    FOUR++;
                    break;
                case 5:
                    FIVE++;
                    break;
            }
        }

        ZERO = (ZERO / numbers.length) * 100;
        ONE = (ONE / numbers.length) * 100;
        TWO = (TWO / numbers.length) * 100;
        THREE = (THREE / numbers.length) * 100;
        FOUR = (FOUR / numbers.length) * 100;
        FIVE = (FIVE / numbers.length) * 100;


        return new double[]{ZERO, ONE, TWO, THREE, FOUR, FIVE};
    }
}
