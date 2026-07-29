class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        HashMap <Character, Integer> count = new HashMap<>();

        for (int right=0; right < s.length(); right ++)
        {
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);

            while ( (right - left + 1) - Collections.max(count.values()) > k )
            {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left ++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}