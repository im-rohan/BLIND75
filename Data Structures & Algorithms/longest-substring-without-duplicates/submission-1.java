class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        HashSet<Character> unique = new HashSet<>();

        for (int right = 0; right < s.length(); right ++)
        {
            while (unique.contains(s.charAt(right)))
            {
                unique.remove(s.charAt(left));
                left++;
            }

            unique.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
