// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word 
// or phrase, typically using all the original letters exactly once.
// Example 1: Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2: Input: s = "rat", t = "car"
// Output: false


import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        //convert strings to character arrays
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        // sort the character arrays (o(nlogn))
        Arrays.sort(ss);
        Arrays.sort(tt);
        //check if sorted arrays are equal
        for (int i = 0; i < ss.length; i++) {
            if(ss[i]!= tt[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram(new String("rat"), new String("tar")));
        System.out.println(isAnagram(new String("rat"), new String("pat")));

    }
}
