class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    private void divide(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        divide(nums, left, mid);
        divide(nums, mid + 1, right);

        conquer(nums, left, mid, right);
    }

    private void conquer(int[] nums, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                merged[k++] = nums[i++];
            } else {
                merged[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = nums[i++];
        }

        while (j <= right) {
            merged[k++] = nums[j++];
        }

        for (int p = 0; p < merged.length; p++) {
            nums[left + p] = merged[p];
        }
    }
}