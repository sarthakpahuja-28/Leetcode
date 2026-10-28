class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] arr = new int[2];
        boolean [] check = new boolean[grid.length*grid.length];
        int x=-1;
        for(int i=0;i<grid.length;i++){
            boolean isFlag=false;
            for(int j=0;j<grid.length;j++){
                  if(check[grid[i][j]-1]){
                    isFlag=true;
                    x=grid[i][j];
                  }
                  check[grid[i][j]-1]=true;
            }
            if(isFlag) arr[0]=x;

        }
        for(int i=0;i<check.length;i++){
            if(!check[i]){
                arr[1]=i+1;
                break;
            }
        }
        return arr;

    }
}