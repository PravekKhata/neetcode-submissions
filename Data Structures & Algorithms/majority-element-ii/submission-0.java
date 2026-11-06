class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> majorityElement = new ArrayList<>();

        // insert each element in HashMap
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // check HashMap if num has count > n/ 3
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > (nums.length / 3)) {
                majorityElement.add(entry.getKey());
            }
        }

        return majorityElement;
    }
}