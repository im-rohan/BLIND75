class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] * len(nums)

        prefix = 1

        for pre_idx in range(len(nums)):
            output[pre_idx] = prefix
            prefix *= nums[pre_idx]
        
        postfix = 1
        for post_idx in range(len(nums) - 1, -1, -1):
            output[post_idx] *= postfix
            postfix *= nums[post_idx]
        
        return output