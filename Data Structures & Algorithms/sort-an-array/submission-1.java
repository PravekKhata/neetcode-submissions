class Solution {
    public int[] sortArray(int[] nums) {
        
        // using merge sort
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] arr, int left, int right){

        // if the position of left is > than right, then arr is sorted
        if(left >= right){
            return;
        }

        // break each part of array till 1 element remains
        int mid = left + (right - left) / 2;

        // sort left half
        mergeSort(arr, left, mid);

        // sort right half
        mergeSort(arr, mid + 1, right);

        // merge both sorted halves
        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right){

        ArrayList<Integer> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }

        // copy remaining elements for i & j
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }

        while(j <= right){
            temp.add(arr[j]);
            j++;
        }

        for(int k = 0; k < temp.size(); k++){
            arr[left + k] = temp.get(k);
        }
    }
}