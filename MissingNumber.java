import java.util.stream.IntStream;

//You are given an array containing 'n' distinct numbers taken from the range
// 0 to 'n'. Since the array has only 'n' numbers out of the total 'n+1'
// numbers, find the missing number
public class MissingNumber {
    public static void main(String[] args){
        System.out.println(findTheMissingNumber(new int[]{0,1,2,3,4,6}));
    }

    private static int findTheMissingNumber(int[] ints) {
        // sigma(n)-sum(array)
        return ints.length*(ints.length+1)/2 - IntStream.of(ints).sum(); //time Complexity : O(n)

        //Other alternative approaches
        //brute force - iterate through array to find each number start from 0 to n
        // stop at the number between 0 to n that you did not find in array, time Complexity : O(n^2)

        //better than brute force
        //sort the give array , O(nlogn)
        //consecutive numbers should not differ by 1.
        //the differ their average is the missing number
    }
}
