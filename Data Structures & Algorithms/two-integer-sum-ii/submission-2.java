class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] returnedIndex = new int[2];
        int p1 = 0;

        while (p1 < numbers.length - 1) {
            int p2 = p1 + 1;

            while (p2 < numbers.length) {
                if (numbers[p1] + numbers[p2] == target) {
                    returnedIndex[0] = p1 + 1;
                    returnedIndex[1] = p2 + 1;
                    return returnedIndex;
                }
                p2++;
            }
            p1++;
        }
        return returnedIndex;
    }
}
