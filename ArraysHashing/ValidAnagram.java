package ArraysHasing;
import java.util.Arrays;
/*

 Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.

 */

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        ValidAnagramSolution vas = new ValidAnagramSolution();

        boolean result = vas.isAnagram(s, t);
        System.out.println(result);
    }
}


class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {

        // IF THE LENGTH OF THE S STRING AND T STRING IS NOT EQUALS RETURN FALSE
        if(s.length() != t.length()) {
            return false;
        }

        // MAKE THE T, AND S STRING IN TO CHARACTERS OF ARRAYS
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        // SORT THE sSort, AND tSort IN ALPHABETICAL ORDER
        Arrays.sort(sSort);
        Arrays.sort(tSort);


        // RETURNS TRUE IF THE TO SORTED CHAR ARRAY IS EQUALS
        return Arrays.equals(sSort, tSort);
    }
}