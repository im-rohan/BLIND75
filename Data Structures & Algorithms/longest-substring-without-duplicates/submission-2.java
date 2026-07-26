class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        HashMap<Character, Integer> unique = new HashMap<>();

        for (int right = 0; right < s.length(); right ++)
        {
            if (unique.containsKey(s.charAt(right)))
            {
                left = Math.max( unique.get(s.charAt(right)) + 1 , left);
            }

            unique.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
