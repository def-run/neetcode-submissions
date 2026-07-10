class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) newStr.append(ch);
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) temp.append(ch);
        }

        return temp.toString().toLowerCase().equals(newStr.toString().toLowerCase());
    }
}
