# Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
#find two numbers such that they add up to a specific target number. Let these two numbers 
# be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
# Return the indices of the two numbers, index1 and index2, added by one as an integer 
# array [index1, index2] of length 2.
# The tests are generated such that there is exactly one solution. 
# You may not use the same element twice.
# Your solution must use only constant extra space.

def twoSum2(numbers, target):
  i = 0
  j = len(numbers) - 1  #these are our two pointers
  while(i<j):
    temp_sum = numbers[i] + numbers[j]
    if temp_sum == target:
      return [i+1,j+1]    #adding 1 since this is 1-indexed array
    elif (temp_sum < target):
      i = i+1
    elif (temp_sum>target):
      j = j-1


