class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            int check = nums[i];
            int count = 1;
            boolean start = true;
            while(start) {
                if(set.contains(++check)) {
                    count++;
                }
                else {
                    maxCount = Math.max(count, maxCount);
                    start = false;
                }
            }
        }

        return maxCount;
    }
}
