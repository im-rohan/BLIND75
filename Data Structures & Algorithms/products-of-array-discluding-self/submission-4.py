class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] * len(nums)

        for pre_idx in range(1, len(nums)):
            output[pre_idx] = output[pre_idx - 1] * nums[pre_idx - 1]
        
        post = 1
        for post_idx in range(len(nums) - 1, -1, -1):
            output[post_idx] *= post
            post *= nums[post_idx]
        
        return output