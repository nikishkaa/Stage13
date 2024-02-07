package by.itstep.goutor.javastage.stage13.task.task1.model.logic;

public class GeometricMean {
    public static final int ERROR = -1;

    public static double getGeometricMeanLogic(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return ERROR;
            }
        }


        double geometricMeans = 1;

        for (int count = 0; count < numbers.length; count++) {
            geometricMeans *= numbers[count];
        }

        geometricMeans = Math.pow(geometricMeans, (double) 1 / numbers.length);

        return geometricMeans;
    }
}
