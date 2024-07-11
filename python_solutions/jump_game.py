class Solution:
    def canJump(self, nums):
        finalPos = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            if i + nums[i] >= finalPos:
                finalPos = i
        return finalPos == 0
