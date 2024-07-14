class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        #sort the array
        strs.sort()
        answer = ''
        first = strs[0]
        last = strs[len(strs)-1]
        for i in range(len(first)):
            if (first[i]!=last[i]):
                break
            answer = answer + first[i]
        return answer
