class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // use HashMap
        int[] res = new int[k];
        int idx = 0;
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i: nums){
            count.put(i, count.getOrDefault(i,0) + 1);
        }

        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort((a,b) -> Integer.compare(b.getValue(),a.getValue()));

        for(int i = 0; i < k; i++){
            res[i] = entries.get(i).getKey();
        }

        return res;
    }
    
}
