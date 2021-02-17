//find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’
class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
        int slicedWindowSum=0, minSlicedWindowLen=Integer.MAX_VALUE;
        for( int  sliceStartPos=0, sliceEndPos=0; sliceEndPos < arr.length; sliceEndPos++){
            slicedWindowSum += arr[sliceEndPos];
            while(slicedWindowSum >= S){
                minSlicedWindowLen = Math.min(minSlicedWindowLen, sliceEndPos-sliceStartPos+1);
                slicedWindowSum -= arr[sliceStartPos];
                sliceStartPos++;
                //check if the window can be squeezed further from left to minimize length
            }
        }
        return minSlicedWindowLen==Integer.MAX_VALUE? 0 : minSlicedWindowLen;
    }

    public static void main(String[] args) {
        int result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
    }
}
