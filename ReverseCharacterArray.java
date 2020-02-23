class Solution {
    public void reverseString(char[] s) {
       helper(0, s.length-1, s);
    }

    void helper(int i,int j,  char[] str) {
         if (str == null || i >= j) {
            return;
        }
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        helper(i + 1, j - 1, str);
    }
}
