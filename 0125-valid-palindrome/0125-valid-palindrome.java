class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(ch >= 'a' && ch <='z') {
                sb.append(ch);
            }
            else if(ch >= 'A' && ch <='Z')
            {
                ch = (char)((int)ch - (int)'A' + (int)'a');
                sb.append(ch);
            }
            else if(ch >= '0' && ch <= '9')
            {
                sb.append(ch);
            }
        }
        String str = sb.toString();
        // System.out.println(str);
        return palindrome(str, 0, str.length()-1);
    }
    
    public boolean palindrome(String str, int start, int end) {
        if(start >= end) {
            return true;
        }

        if(str.charAt(start) == str.charAt(end)) {
            return palindrome(str, start+1, end-1);
        } else {
            return false;
        }
    }
}
