class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        int h,width,area=0;
        while(left<right){
            h=Math.min(height[left],height[right]);
            width=right-left;
            area=h*width;
            max=Math.max(area,max);
            if(height[left]<height[right]) left++;
            else if(height[left]>=height[right]) right--;
        }
        return max;
    }
}