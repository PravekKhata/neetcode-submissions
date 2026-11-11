class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = n-1;
        for(int i = m+n-1; i >= m; i--){
            if(nums1[i] == 0){
                nums1[i] = nums2[j--];
            }
        }

        Arrays.sort(nums1);
    }
}