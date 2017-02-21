public class Question2 {
    public int[] twoSum(int[] nums, int target) {
        int indicies[] = new int[] {0, 0}; // initially set to 0, 0, althought it maybe should return null, null, as 0 is an index
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indicies[0] = i;
                    indicies[1] = j;
                    return indicies;
                }
            }
        }
        return indicies;
    }
}