import java.util.Arrays;

public class AverageOfSubarrayOfSizeKOptimized {

    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeKOptimized
                .findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});// time complexity : O(array.length)
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverages(int sliderLength, int[] array) {
        double[] result = new double[array.length - sliderLength + 1];
        double windowSum = 0;
        double previousWindowSum = 0;
        for(int index=0; index<array.length-sliderLength + 1; index++){// time complexity : O(array.length)
            if(previousWindowSum==0){
                for(int pos=index; pos<index+sliderLength; pos++){ // time complexity : O(K)
                    windowSum += array[pos];
                }
            }
            else{
                windowSum=previousWindowSum - array[index-1]+array[index+sliderLength-1];// time complexity : O(array.length)
            }
            result[index]=windowSum/sliderLength;
            previousWindowSum = windowSum;
        }
        return result;
    }
}
//Answer: [2.2, 2.8, 2.4, 3.6, 2.8]
