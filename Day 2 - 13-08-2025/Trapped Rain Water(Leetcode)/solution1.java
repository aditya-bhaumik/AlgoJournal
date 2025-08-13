class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // step 1 - Calculate the left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // step 2 - Calculate the right max boundary - array

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = n-2; i>=0; i--){
           rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        }
        //loop
        int trapped = 0;
        for(int i = 0; i<n; i++){
        //waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
        //trapped water = waterlevel - height[i];
            trapped = trapped + (waterlevel-height[i]);
        }
        return trapped;
    }
}
