class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        System.out.println(findMaxSumSubArray(3, new int[] {2, 1, 5, 1, 3, 2}));
        System.out.println(findMaxSumSubArray(2, new int[] {2, 3, 4, 1, 5}));
    }

    public static int findMaxSumSubArray(int k, int[] arr) {
        // TODO: Write your code here
        int maximumSubArraySum=0;
        int prevWindowSum=0;
        for(int start = 0; start < arr.length-k+1 ; start++){
            int current_window_sum = findSumSubArray(arr, start, k, prevWindowSum);
            maximumSubArraySum = Math.max(maximumSubArraySum,current_window_sum);
            prevWindowSum=current_window_sum;
        }
        return maximumSubArraySum;
    }
    public static  int findSumSubArray(int[] arr, int start, int k, int prevWindowSum){
        if (start !=0){
            return prevWindowSum - arr[start-1]+arr[start + k-1];
        }
        else{
            int windowSum = 0;
            for(int pos = 0 ; pos<k; pos++){
                windowSum += arr[pos];
            }
            return windowSum;
        }
    }
}
