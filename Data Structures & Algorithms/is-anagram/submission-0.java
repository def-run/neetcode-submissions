class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        char[] sStr = s.toCharArray();
        char[] tStr = t.toCharArray();


        for(char i : sStr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(char j : tStr) {
            map.put(j, map.getOrDefault(j, 0) - 1);
        }

        for(int x : map.values()) {
            if(x != 0) return false;
        }

        return true;
    }
}
