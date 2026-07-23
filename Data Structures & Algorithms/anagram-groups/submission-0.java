class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<int[]> freq = new ArrayList<>();
        List<String> arr = new ArrayList<>();

        for(String s : strs) {
            arr.add(s);
        }

        int i = 0;
        while(i < strs.length) {
            int[] convert = new int[26];
            for(char c : strs[i].toCharArray()) {
                convert[c - 'a']++;
            }
            freq.add(convert);
            i++;
        }

        List<List<String>> res = new ArrayList<>();
        for(int j = 0; j < arr.size(); j++) {
            List<String> word = new ArrayList<>();
            word.add(arr.get(j));
            for(int k = j + 1; k < arr.size(); k++) {
                if(Arrays.equals(freq.get(j), freq.get(k))) {
                    word.add(arr.get(k));
                    arr.remove(k);
                    freq.remove(k);
                    k--;
                }
            }
            res.add(word);
        }

        return res;
    }
}
