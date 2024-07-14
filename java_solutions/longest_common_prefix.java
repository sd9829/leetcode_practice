class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        
        //sort in ascending order
        Arrays.sort(strs);
        
        //put the first word in array to comparare characters
        char[] first = strs[0].toCharArray();
        
        //same thign ith last word
        char[] last = strs[strs.length -1].toCharArray();

        for(int i =0; i<first.length; i++){
            if(first[i] != last[i]) 
                break;
            answer.append(first[i]);
        }

        return answer.toString();

        
    }
}
