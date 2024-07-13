class Solution:
        
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k = k % len(nums)
        def reverse(start: int, end: int) -> None:
            while start < end:
                nums[start], nums[end] = nums[end], nums[start]
                start += 1
                end -= 1
        
        # Reverse the entire array
        reverse(0, len(nums) - 1)
        # Reverse the first k elements
        reverse(0, k - 1)
        # Reverse the remaining elements
        reverse(k, len(nums) - 1)

    
        
