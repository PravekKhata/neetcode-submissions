class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) return 0;
        // use sorting
        Arrays.sort(nums); // [0,1,1,2,3,4,5,6]

        int current = 1;
        int longest = 1;

        for(int i = 1; i < nums.length; i++){
            
            if (nums[i] == nums[i-1]) continue;

            if (nums[i] == nums[i-1] + 1) { // next value = prevVal + 1, they are consecutive     
                current ++;
            }else{
                current = 1;
            }
            longest = Math.max(longest, current);

        }

        return longest;
    }
}
