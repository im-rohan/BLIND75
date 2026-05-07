class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> count = new HashMap <>();
        int [] topk = new int [k];
        Arrays.fill(topk, 0);

        for (int i=0; i<nums.length; i++)
        {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        for (int i=0; i<k; i++)
        {
            int key = Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
            topk[i] = key;
            count.remove(key);
        }

        return topk;
    }
}
