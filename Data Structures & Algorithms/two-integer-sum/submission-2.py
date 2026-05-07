class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i = 0
        j = 0

        if len(nums) == 2:
            return [0, 1]
        
        sums = {}

        for idx, num in enumerate(nums):
            remainder = target - num

            if remainder in sums:
                return [sums[remainder], idx]
            
            sums[num] = idx