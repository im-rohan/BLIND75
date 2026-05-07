class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = {}
        topk = [0] * k

        for num in nums:
            counts[num] = counts.get(num, 0) + 1
        
        for idx in range(k):
            max_key = max(counts, key=counts.get)
            topk[idx] = max_key
            counts.pop(max_key)
        
        return topk
