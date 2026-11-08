class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length;

        int result = 1;

        for(int i: nums){
            if(i == result){
                //if number is present, increment result
                result ++;
            }else if(i > result){ // [2,3], result = 2 > 1 (t), Return 1
                break;
            }
        }
        return result;

    }
}