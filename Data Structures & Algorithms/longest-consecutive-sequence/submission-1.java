class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numset = new HashSet<Integer>();

        for (int i=0; i<nums.length; i++)
        numset.add(nums[i]);

        int lcs = 0;

        for (int num : numset)
        {
            if (!numset.contains(num - 1))
            {
                int length = 1;
                while (numset.contains(num + length))
                length++;
                lcs = length > lcs ? length : lcs;
            }
        }

        return lcs;

    }
}
