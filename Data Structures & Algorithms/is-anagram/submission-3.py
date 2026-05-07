class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False

        dict_s, dict_t = {}, {}
        for char_s, char_t in zip(s, t):
            dict_s[char_s] = dict_s.get(char_s, 0) + 1
            dict_t[char_t] = dict_t.get(char_t, 0) + 1

        if dict_s != dict_t:
            return False
        
        return True
        