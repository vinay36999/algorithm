import java.util.HashMap;

/*
* Given an array of integers and a value, determine if there are any two integers
* in the array whose sum is equal to the given value.
*/
public class SumOfTwoNumberEqualsGivenValue{
    public static void main(String[] args) {
        System.out.println(anyTwoNumberSumToAGiveValue(5, new int[]{1,3,4,2}));
    }

    private static boolean anyTwoNumberSumToAGiveValue(int sum, int[] array) {
        HashMap neededPair = new HashMap<>();
        for(int num : array){ //time complexity: O(n)
            if(neededPair.containsKey(num)){
                return true;
            }
            else{
                neededPair.put(sum-num, num);
            }
        }
        return false;
    }
}
