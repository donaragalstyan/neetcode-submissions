class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int n : freq.keySet()) {
            minHeap.offer(n);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = minHeap.poll();
        }

        return res;
    }
}
