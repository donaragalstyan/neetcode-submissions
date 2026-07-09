class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; ++i){
            set.add(nums[i]);
        }

        return !(nums.length == set.size());
    }
}
