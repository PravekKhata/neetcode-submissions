class Solution {
    public int removeDuplicates(int[] nums) {
        
        // use Set
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for(int num: nums){
            uniqueElements.add(num);
        }

        //changing values in place for nums array
        int index = 0;
        for(int num: uniqueElements){
            nums[index++] = num;
        }

        return uniqueElements.size();
    }
}