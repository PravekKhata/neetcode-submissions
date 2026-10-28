class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length;

        for(int pass = 0; pass < len-1; pass++){

            boolean swapped = false;

            for(int i = 1; i < len - pass; i++){

                if(nums[i] < nums[i-1]){
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
        return nums;
    }
}