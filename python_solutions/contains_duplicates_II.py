class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hashmap = {} #dict
        for i in range(len(nums)):
            if(hashmap.get(nums[i]) is not None):
                prevIndex = hashmap.get(nums[i])
                if(abs(prevIndex -i) <= k):
                    return True
            hashmap.update({nums[i]: i})
        return False
