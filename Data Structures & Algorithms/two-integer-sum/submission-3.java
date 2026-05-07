class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> sums = new HashMap <>();

        int [] solution = {0, 0};

        for (int i=0; i< nums.length; i++)
        {
            int remainder = target - nums[i];

            if (sums.containsKey(remainder))
            {
                solution[0] = sums.get(remainder);
                solution[1] = i;

                break;
            }

            sums.put(nums[i], i);
        }

        return solution;
    }
}