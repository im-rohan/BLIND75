class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        newstr = ""
        for c in s:
            if c.isalnum():
                newstr += c.lower()
        
        return newstr == newstr[::-1]