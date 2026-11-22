class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // using sliding window
        Set<Integer> window = new HashSet<>();
        int i = 0;

        for(int j = 0; j < nums.length; j++){
            if(j - i > k){
                window.remove(nums[i]);
                i++;
            }

            if(window.contains(nums[j])){
                return true;
            }

            window.add(nums[j]);
        }

        return false;

    }
}