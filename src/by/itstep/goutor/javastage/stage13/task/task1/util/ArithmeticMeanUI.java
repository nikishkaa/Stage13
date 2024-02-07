package by.itstep.goutor.javastage.stage13.task.task1.util;

public class ArithmeticMeanUI {
    public static String getArithmeticMeanUI(double arithmeticMeans) {

        String msg = "\nArithmetic means is: ";

        return arithmeticMeans < 0 ? "\nError" : msg + arithmeticMeans;
    }

}
