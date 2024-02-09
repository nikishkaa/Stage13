package by.itstep.goutor.javastage.stage13.task.task7.model.logic;

public class ExamResultCalc {
    public static double[] getExamResult(int[] numbers) {

        double[] examResult = new double[6];

        double zero = 0;
        double one = 0;
        double two = 0;
        double three = 0;
        double four = 0;
        double five = 0;

        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
            }
        }

        zero = zero / numbers.length * 100;
        one = one / numbers.length * 100;
        two = two / numbers.length * 100;
        three = three / numbers.length * 100;
        four = four / numbers.length * 100;
        five = five / numbers.length * 100;


        //int count = 0;

        //examResult[count++] = zero;
        //examResult[count++] = one;
        //examResult[count++] = two;
        //examResult[count++] = three;
        //examResult[count++] = four;
        //examResult[count] = five;

examResult=examResult[]{zero, one, two, three,four, five}

        return examResult;
    }
}
