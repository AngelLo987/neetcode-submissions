class Solution {
    public int maxArea(int[] heights) {
        int left = 0; 
        int right = heights.length-1; 
        int maxArea = 0;
        while (right > left){
            int tempArea = Math.min(heights[left], heights[right]);
            tempArea *= (right-left);
            if (tempArea > maxArea){
                maxArea = tempArea;
            }
            if (heights[right] > heights[left]){
                left++; 
            }
            else{ 
                right--;
            }
        }
        return maxArea;
    }
}
