class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> count = new HashMap <>();
        int [] topk = new int [k];
        ArrayList<Integer> [] freq = new ArrayList[nums.length + 1];

        for (int i=0; i<nums.length; i++)
        {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            freq[i] = new ArrayList <>();
        }
        freq[nums.length] = new ArrayList <>();
        
        for (int key: count.keySet())
        {
            freq[count.get(key)].add(key);
        }

        int idx = 0;

        outer:
        for (int i=freq.length - 1; i>=0; i--)
        {
            for (int num: freq[i])
            {
                topk[idx++] = num;
                if(idx == k)
                break outer;
            }
        }

        return topk;
    }
}
