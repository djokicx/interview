// 485. Max Consecutive Ones
// https://leetcode.com/problems/max-consecutive-ones/
public class Question1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0; // initialize the current count
        int countMax = 0; // initialize the countMax count
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) { // if the digit at the index == 1
                current++; // update the current count
                countMax = Math.max(current, result); // update the existing countMax by comparing current value to max value
                // initially this value is 0, therefore, if no 1s are in the array, and the code never reaches within this
                // if statement, it will return a 0. countMax cannot be placed within the else because of a special case
                // array [1]!
            }
            else {
                current = 0;
            }
        }
        return countMax;
    }
}