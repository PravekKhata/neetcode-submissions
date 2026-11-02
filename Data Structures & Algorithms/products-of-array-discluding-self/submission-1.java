class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // use prefix + suffix
        // calculate everything to left except self * everything to right except self

        int[] res = new int[nums.length];

        res[0] = 1;

        // calculate product for the left side except self
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        // calculate product for the right side except self
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}  
