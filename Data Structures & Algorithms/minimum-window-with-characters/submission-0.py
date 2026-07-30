class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "": return ""

        count, window = {}, {}

        for letter in t:
            count[letter] = count.get(letter, 0) + 1
        
        left = 0
        sub, subLen = [-1, -1], float("infinity")
        have, need = 0, len(count)

        for right in range(len(s)):
            window[s[right]] = window.get(s[right], 0) + 1

            if s[right] in count and count[s[right]] == window[s[right]]:
                have += 1
            
            while have == need:
                if (right - left + 1) < subLen:
                    sub = [left, right]
                    subLen = right - left + 1

                window[s[left]] -= 1
                if s[left] in count and window[s[left]] < count[s[left]]:
                    have -= 1
                
                left += 1
        
        l, r = sub
        return s[l : r+1] if subLen != float("infinity") else ""
