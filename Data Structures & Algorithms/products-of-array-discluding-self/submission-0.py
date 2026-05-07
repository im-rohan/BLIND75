class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pref = []
        suff = []

        pref_mul = 1
        suff_mul = 1

        output = []

        for num in nums:
            pref.append(pref_mul)
            pref_mul *= num
        
        for num in reversed(nums):
            suff.append(suff_mul)
            suff_mul *= num
        
        for pre, suf in zip(pref, reversed(suff)):
            output.append(pre * suf)
        
        return output