package by.itstep.goutor.javastage.stage13.task.task3.model.logic;

public class NumbersLogic {
    public static boolean getOrderedNumbers(int[] numbers) {

        boolean ordered = false;


        boolean increasing = getIncreasing(numbers);
        boolean decreasing = getDecreasing(numbers);

        if (increasing || decreasing) {
            ordered = true;
        }


        return ordered;
    }

    private static boolean getIncreasing(int[] numbers) {

        boolean increasing = true;


        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) {
                increasing = false;
                break;
            }

        }

        return increasing;
    }


    private static boolean getDecreasing(int[] numbers) {

        boolean decreasing = true;
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > numbers[i - 1]) {
                decreasing = false;
                break;
            }

        }

        return decreasing;
    }


}
