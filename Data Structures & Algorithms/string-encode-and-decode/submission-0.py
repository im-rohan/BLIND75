class Solution:

    def encode(self, strs: List[str]) -> str:
        encode = ""
        for string in strs:
            encode += str(len(string)) + "@" + string
        return encode

    def decode(self, s: str) -> List[str]:
        decode = []
        index = 0

        while index < len(s):
            j = index
            while s[j] != "@":
                j += 1
            length = int(s[index:j])
            decode.append(s[j+1 : j+1+length])
            index = j+1+length
        return decode
