import java.util.HashMap;

public class containsDuplicatesII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(containsDuplicatesII(nums1, k1)); // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(containsDuplicatesII(nums2, k2)); // Output: true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(containsDuplicatesII(nums3, k3));

    }

    public static boolean containsDuplicatesII(int[] nums, int k){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                //get the value at that key
                int prevIndex = hashMap.get(nums[i]);
                if(Math.abs(prevIndex - i) <= k){
                    return true;
                }
            }
            //if the key did not exist, put it
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
