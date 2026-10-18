class Solution {
    public int mirrorDistance(int n) {
        String x="";
        StringBuilder sb= new StringBuilder(n+"");
        x=sb.reverse().toString();
        int y=Integer.parseInt(x);
        return Math.abs(n-y);
        
    }
}