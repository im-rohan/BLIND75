class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxLen, left = 0, 0
        unique = {}

        for right in range(len(s)):
            if s[right] in unique:
                left = max(left, unique[s[right]] + 1)
            unique[s[right]] = right
            maxLen = max(maxLen, right - left + 1)
        
        return maxLen