class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean zerosPresent = false; 
        int total = 1; 
        int zeroIndex = -1; 

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                total *= nums[i];
            }
            else{
                if (!zerosPresent){
                    zeroIndex = i;
                    zerosPresent = true; 
                }
                else {
                    total = 0; 
                    break; 
                }
            }
        }

        if (zerosPresent){
            for (int i = 0; i < nums.length; i++){
                if (i != zeroIndex){
                    nums[i] = 0;
                }
                else{ 
                    nums[i] = total; 
                }
            }
        }
        else {
            for (int i = 0; i < nums.length; i++){
                nums[i] = total/nums[i];
            }
        }
        return nums;
    }
}