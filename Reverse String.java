class Solution {
    public void reverseString(char[] s) {
    for(int i = 0; i < s.length/2; i++){
        char ans = s[i];
        s[i] = s[s.length - i - 1];
        s[s.length - i - 1] = ans;
    }
}
}
/* Runtime: 1 ms, faster than 56.76% of Java online submissions for Reverse String.
Memory Usage: 46.3 MB, less than 52.28% of Java online submissions for Reverse String.
*/
