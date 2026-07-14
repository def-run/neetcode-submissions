class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0;
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while(set.contains(ch)) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            result = Math.max(result, set.size());
        }

        return result;
    }
}
