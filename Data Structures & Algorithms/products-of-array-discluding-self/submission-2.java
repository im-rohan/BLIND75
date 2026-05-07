class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int [] pref = new int [len];
        int [] suff = new int [len];

        int pref_mul = 1;
        int suff_mul = 1;

        int [] output = new int [len];

        for (int i=0, j=len-1; i<len && j>=0; i++, j--)
        {
            pref[i] = pref_mul;
            pref_mul *= nums[i];

            suff[j] = suff_mul;
            suff_mul *= nums[j];
        }

        for (int i=0; i<len; i++)
        {
            output[i] = pref[i] * suff[i];
        }

        return output;
    }
}