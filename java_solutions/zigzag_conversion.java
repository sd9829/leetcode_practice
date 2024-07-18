class Solution {
    public String convert(String s, int numRows) {
        //base case
        if(numRows == 1){
            return s;
        }
        StringBuilder ans = new StringBuilder();
        for(int row=0; row < numRows; row++){
            int increment = 2 * (numRows-1);
            for(int i = row; i < s.length(); i = i+increment){
                ans.append(s.charAt(i));
                if(row > 0 && row < numRows -1 && 
                i+increment - (2*row) < s.length()){
                    ans.append(s.charAt(i+increment - (2*row)));
                }
            }
        }
        return ans.toString();
        
    }
}
