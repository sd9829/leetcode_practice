# problem: Given an integer array nums sorted in non-decreasing order, 
# remove the duplicates in-place such that each unique element appears only once.
# Input: nums = [0,0,1,1,1,2,2,3,3,4]
# Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

def removeDuplicates(nums):
    j = 1
    for i in range(1,len(nums)):
        if nums[i] != nums[i-1]:
            nums[j] =  nums[i]
            j = j+1
    return j


print(removeDuplicates([1,2,3,3]))
