public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        //how many times each number is repeated
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        //making a minHeap, the ovveride means 
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0]; // Compare by frequency (smaller frequencies have higher priority)
            }
        });

        for (int num : count.keySet()) {
            int frequency = count.get(num);
            heap.add(new int[]{frequency, num});
            if (heap.size() > k) {
                heap.poll(); // Remove the least frequent element in the heap
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }
        return res;
    }
}