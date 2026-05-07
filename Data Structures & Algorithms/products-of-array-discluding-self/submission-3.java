class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int suff_mul = 1;

        int [] output = new int [len];
        output[0] = 1;

        for (int i=1; i<len; i++)
        {
            output[i] = output[i-1] * nums[i-1];
        }

        for (int j=len-1; j>=0; j--)
        {
            output[j] *= suff_mul;
            suff_mul *= nums[j];
        }

        return output;
    }
}