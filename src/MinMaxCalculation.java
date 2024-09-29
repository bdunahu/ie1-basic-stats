public class MinMaxCalculation {

    public static Double[] minMax(double ... numbers) {
        BasicStats.bubbleSort(numbers);
        double min = numbers[0];
        double max = numbers[numbers.length -1];

        return new Double[]{min, max};
    }
}
