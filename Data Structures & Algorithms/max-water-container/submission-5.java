class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0; 
        int leftPointer = 0; 
        int rightPointer = heights.length-1;
        while (leftPointer < rightPointer){
            int tempArea = rightPointer - leftPointer; 
            tempArea *= Math.min(heights[rightPointer], heights[leftPointer]);
            if (tempArea > maxArea){
                maxArea = tempArea;
            }
            if (heights[leftPointer] < heights[rightPointer]){
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }
        return maxArea;
    }
}
