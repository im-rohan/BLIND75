class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        count = defaultdict(list)

        for string in strs:
            sort_str = "".join(sorted(string))
            count[sort_str].append(string)
        
        return list(count.values())