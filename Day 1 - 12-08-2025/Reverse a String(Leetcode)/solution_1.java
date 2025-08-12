class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[0];
        for(int i = s.length - 1; i>=0; i--){
            temp = Arrays.copyOf(temp, temp.length+1);
            temp[temp.length - 1] = s[i];
        }
        for(int i = 0; i<s.length; i++){
            s[i] = temp[i];
        }
    }
}

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 

// Constraints:

// 1 <= s.length <= 105
// s[i] is a printable ascii character.
