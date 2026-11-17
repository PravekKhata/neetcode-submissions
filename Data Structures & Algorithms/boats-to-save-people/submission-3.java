class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // 1. find the maximum weight
        int max = 0;
        for (int p : people) max = Math.max(max, p);

        // 2. count the frequency of each weight
        int[] count = new int[max + 1];
        for (int p : people) count[p]++;

        // 3. rebuild the sorted array from the counts
        int idx = 0;
        for (int w = 0; w <= max; w++) {
            while (count[w] > 0) {
                people[idx++] = w;
                count[w]--;
            }
        }

        // 4. same two-pointer greedy as before
        int left = 0, right = people.length - 1, boats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) left++;   // the lightest joins if they fit
            right--;                                              // the heaviest always leaves
            boats++;
        }
        return boats;
    }
}