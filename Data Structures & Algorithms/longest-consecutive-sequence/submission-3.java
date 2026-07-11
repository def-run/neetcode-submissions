class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        int maxCount = 0;
        for(int i : nums) {
            if(!set.contains(i - 1)) {
                int count = 0;
                while(set.contains(i++)) {
                    count++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }
}
