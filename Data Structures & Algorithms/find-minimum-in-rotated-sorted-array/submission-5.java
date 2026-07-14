class Solution {
    public int findMin(int[] nums) {
        int small = nums[0];
        int left = 0;
        int right = nums.length - 1;

        while (left <= right)
        {
            if (nums[left] < nums[right])
            {
                small = Integer.min(small, nums[left]);
                break;
            }

            int mid = (left + right) / 2;
            small = Integer.min(small, nums[mid]);

            if (nums[left] <= nums[mid])
            left = mid + 1;
            else
            right = mid - 1;
        }

        return small;
    }
}
