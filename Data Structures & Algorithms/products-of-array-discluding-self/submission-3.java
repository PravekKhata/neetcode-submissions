class Solution {
    public int[] productExceptSelf(int[] nums) {

        // USE DIVISION
        // If we know the product of all non-zero numbers, we can easily compute the answer for each position using division
        int prod = 1, zerocount = 0;

        for(int num : nums){
            if(num != 0){
                prod *= num;
            }else{
                zerocount++;
            }
        }

        if(zerocount > 1) return new int[nums.length];

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zerocount > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }else{
                res[i] = prod / nums[i];
            }
        }

        return res;

    }
}  
