class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pref = []
        suff = []

        pref_mul = 1
        suff_mul = 1

        output = []

        for idx, num in enumerate(nums):
            pref.append(pref_mul)
            pref_mul *= num
            suff.append(suff_mul)
            suff_mul *= nums[len(nums) - idx - 1]
        
        for idx in range(len(nums)):
            output.append(pref[idx] * suff[len(suff) - idx - 1])
        
        return output