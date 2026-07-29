class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxLen, left, maxCount = 0, 0, 0
        count = {}

        for right in range(len(s)):
            count[s[right]] = 1 + count.get(s[right], 0)
            maxCount = max(maxCount, count[s[right]])

            while (right - left + 1) - maxCount > k:
                count[s[left]] -= 1
                left += 1
            
            maxLen = max(maxLen, right - left + 1)
        
        return maxLen