class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1

        small = nums[0]

        while left <= right:
            if nums[left] < nums[right]:
                small = min(small, nums[left])
                break
            
            mid = (left + right) // 2
            small = min(small, nums[mid])

            if nums[mid] >= nums[left]:
                left = mid + 1
            else:
                right = mid - 1
        
        return small