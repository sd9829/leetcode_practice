class Solution:
    def convert(self, s: str, numRows: int) -> str:
        #base case
        if(numRows == 1):
            return s
        
        ans = ""
        for row in range(numRows):
            increment = 2 * (numRows -1)
            for i in range(row, len(s), increment):
                ans += s[i]
                #if not the first and last row
                if(row > 0 and row < numRows-1 and 
                i + increment - (2 * row) < len(s)):
                    ans += s[i + increment - (2 * row)]

        return ans 
