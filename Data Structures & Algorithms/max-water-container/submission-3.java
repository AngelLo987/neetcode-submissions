class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1; 
        int largestArea = 0;

        while(left < right) {
            int min = Math.min(heights[left], heights[right]); 
            int area = min * (right - left); 

            if(area > largestArea) {
                largestArea = area; 
            }

            if(min == heights[left]) {
                left++;
            } else {
                right--; 
            }
        }

        return largestArea; 
    }
}
