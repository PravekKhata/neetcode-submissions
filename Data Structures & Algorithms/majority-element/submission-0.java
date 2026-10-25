class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n: nums){
            freq.put(n, freq.getOrDefault(n,0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }

        return -1;
    }
}