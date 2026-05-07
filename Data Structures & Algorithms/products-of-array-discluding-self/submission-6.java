class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int postfix = 1;
        int prefix = 1;

        int [] output = new int [len];

        for (int i=0; i<len; i++)
        {
            output[i] = prefix;
            prefix *= nums[i];
        }

        for (int j=len-1; j>=0; j--)
        {
            output[j] *= postfix;
            postfix *= nums[j];
        }

        return output;
    }
}