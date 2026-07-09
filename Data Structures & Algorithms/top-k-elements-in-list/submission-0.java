class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int count = 0;

        for (int j = bucket.length - 1; j >= 0 && count < k; j--) {
            if (bucket[j] != null) {
                for (int element : bucket[j]) {
                    result[count++] = element;
                }
            }
        }

        return result;
    }
}