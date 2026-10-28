class Solution {
    public int search(int[] nums, int target) {
        int rightIndex = nums.length-1; 
        int leftIndex = 0; 
        while (leftIndex <= rightIndex){
            int middle = leftIndex + ((rightIndex-leftIndex)/2); 
            int currNum = nums[middle];
            if (currNum != target){
                if (currNum < target){
                    leftIndex = middle + 1;
                }
                else{
                    rightIndex = middle -1;
                }
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
