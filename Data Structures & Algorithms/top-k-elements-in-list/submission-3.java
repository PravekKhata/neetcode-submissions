class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // use bucket sort
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // buckets.get(f) = numbers that appear exactly f times
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int key : count.keySet()) {
            buckets.get(count.get(key)).add(key);
        }

        int[] res = new int[k];
        int idx = 0;
        for (int f = nums.length; f >= 1 && idx < k; f--) {     // highest frequency first
            for (int num : buckets.get(f)) {
                if (idx == k) break;
                res[idx++] = num;
            }
        }
        return res;
    }
}
