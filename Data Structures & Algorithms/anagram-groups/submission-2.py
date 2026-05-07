class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = defaultdict(list)

        for string in strs:
            count = [0] * 26

            for char in string:
                count[ord(char) - ord('a')] += 1
            anagram[tuple(count)].append(string)
        return list(anagram.values())