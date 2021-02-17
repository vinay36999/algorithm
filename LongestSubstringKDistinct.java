import java.util.HashMap;

/*
Given a string, find the length of the longest substring in it with no more than K distinct characters.
Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".*/
class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        int  windowStart=0, maxLength=0;
        HashMap<Character, Integer> charFreqMap = new HashMap();
        for(int windowEnd=0; windowEnd<str.length(); windowEnd++){
         char rightChar = str.charAt(windowEnd);
         charFreqMap.put(rightChar, charFreqMap.getOrDefault(rightChar, 0) + 1);
         while(charFreqMap.size() > k){
             char leftChar = str.charAt(windowStart);
             charFreqMap.put(leftChar, charFreqMap.get(leftChar)-1);
             if(charFreqMap.get(leftChar) == 0){
                 charFreqMap.remove(leftChar);
             }
             windowStart++;
         }
            maxLength = Math.max(maxLength, windowEnd - windowStart+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));    }
}
