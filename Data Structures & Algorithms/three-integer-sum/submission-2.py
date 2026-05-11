class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = []

        count = defaultdict(int)
        for index, num in enumerate(nums):
            count[num] += 1

        for index in range(len(nums)):

            count[nums[index]] -= 1

            if index > 0 and nums[index] == nums[index - 1]:
                continue

            for j in range(index + 1, len(nums)):
                count[nums[j]] -= 1

                if j > index + 1 and nums[j] == nums[j-1]:
                    continue
                
                target = -(nums[index] + nums[j])

                if count[target] > 0:
                    triplets.append([nums[index], nums[j], target])
            
            for j in range(index + 1, len(nums)):
                count[nums[j]] += 1
        
        return triplets