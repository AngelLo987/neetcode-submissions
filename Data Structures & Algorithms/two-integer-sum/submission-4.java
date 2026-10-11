class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> known = new HashMap<>(); //key: value, value: index
        for (int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if (known.containsKey(needed)){
                return new int[] {known.get(needed), i};
            }
            known.put(nums[i], i);
        }
        return new int []{-1,-1};
    }
}
