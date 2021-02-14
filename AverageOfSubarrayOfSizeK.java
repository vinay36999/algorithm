import java.util.Arrays;

public class AverageOfSubarrayOfSizeK{
    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverages(int sliderLength, int[] array) {
        double[] findAverages = new double[array.length-sliderLength+1];
        for(int index=0; index<array.length-sliderLength+1; index++){ //overall time complexity: O(sliderLength * length)
            findAverages[index]=findAverage(array,index,sliderLength); //time complexity: O(sliderLength)
        }
        return findAverages;
    }

    private static double findAverage(int[] array, int start, int sliderLength) {
        double sum = 0;
        for(int index = start ; index< start+sliderLength; index++){ //time complexity: O(sliderLength)
            sum += array[index];
        }
        return sum/sliderLength;
    }
}
