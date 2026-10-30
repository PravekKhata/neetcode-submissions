class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // use bucket short -- use heap DS (PriorityQueue)
        Map<Integer,Integer> count = new HashMap<>();

        // get the count of each number in array
        for(int i: nums){
            count.put(i, count.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> freq = new PriorityQueue<>((a,b) -> Integer.compare(count.get(a), count.get(b)));

        for(int key: count.keySet()){
            freq.add(key);
            if(freq.size() > k){
                freq.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = freq.poll();
        }

        return res;
    }
}
