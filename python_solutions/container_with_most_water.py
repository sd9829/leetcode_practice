# You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
# Find two lines that together with the x-axis form a container, such that the container contains the most water.
# Return the maximum amount of water a container can store.
# Notice that you may not slant the container.

def containerWithMostWater(y_axis):
    # the intention is to find a rectangle's height and width so we cna find the area and check what the max area is
    maxArea = 0
    left_pointer = 0
    right_pointer = len(y_axis) - 1

    while (left_pointer< right_pointer):
        breadth = right_pointer - left_pointer
        height = min(y_axis[left_pointer], y_axis[right_pointer]) # the val between left and right pointer, whichever is smaler becomes the length of the container being considered
        area = breadth * height
        maxArea = max(area, maxArea)

        if(y_axis[left_pointer]< y_axis[right_pointer]):
            left_pointer += 1
        else:
            right_pointer -=1

    return maxArea

print(containerWithMostWater([2,3,4,5,18,17,6]))
