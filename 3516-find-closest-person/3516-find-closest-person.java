class Solution {
    public int findClosest(int x, int y, int z) {
        int diff=Math.abs(z-x);
        int diff1=Math.abs(z-y);
        if(diff<diff1)return 1;
        else if(diff>diff1) return 2;
        else return 0;
    }
}