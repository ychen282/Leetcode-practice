#Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
#That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        l = len(nums)
        if l==0:
            return []
        result = []
        for i in range(l):
            count = 0
            for j in range(l):
                if i!=j and nums[j]<nums[i]:
                    count += 1
            result += [count]
        return result
