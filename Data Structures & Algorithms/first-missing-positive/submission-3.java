class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length;

        int result = 1;

        for(int i: nums){
            if(i > 0 && result == i){
                result++;
            }
        }
        return result;

    }
}