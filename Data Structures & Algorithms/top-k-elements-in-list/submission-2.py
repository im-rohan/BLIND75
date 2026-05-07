class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = {}
        topk = []
        freq = [[] for i in range(len(nums) + 1)]

        for num in nums:
            counts[num] = counts.get(num, 0) + 1
        
        for key, value in counts.items():
            freq[value].append(key)
        
        for idx in range(len(freq) - 1, 0, -1):
            for num in freq[idx]:
                topk.append(num)

                if len(topk) == k:
                    return topk
