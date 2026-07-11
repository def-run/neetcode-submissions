class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums) set.add(n);

        int maxCount = 0;
        for(int x : set) {
            if(!set.contains(x - 1)) {
                int count = 0;
                int curr = x;
                while(set.contains(curr)) {
                    curr++;
                    count++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }
}