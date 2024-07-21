import java.util.HashMap;

public class longestConsecutiveSeq {
    public static void main(String[] args) {
        int[] nums = {100,4,200,3,2,1};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums){
        int longestLen = 0; //this is what we will be returning
        HashMap<Integer, Boolean> visistedNums = new HashMap<>();
        for (int num : nums) {
            visistedNums.put(num, Boolean.FALSE);
        }
        for (int num: nums){
            int currentLen = 1;
            //check in next direction
            int nextNum = num + 1;
            while(visistedNums.containsKey(nextNum) && visistedNums.get(nextNum)==false){

                currentLen++;
                visistedNums.put(nextNum, Boolean.TRUE);

                //run the loop for next number too
                nextNum++;
            }

            //check for prev direction
            int prevNum = num-1;
            while(visistedNums.containsKey(prevNum) && visistedNums.get(prevNum)==false){

                currentLen++;
                visistedNums.put(prevNum, Boolean.TRUE);

                //run loop for prev nuimber
                prevNum--;
            }
            longestLen = Math.max(currentLen, longestLen);
        }

        return longestLen;
    }
}
