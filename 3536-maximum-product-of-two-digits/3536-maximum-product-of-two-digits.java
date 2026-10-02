class Solution {
    public int maxProduct(int n) {
        // Stack <Integer> st=new Stack<>();
        // while(n>0){
        //     st.push(n%10);
        //     n=n/10;
        // }
        String x=n+"";
        char [] arr=x.toCharArray();
        if(arr.length==1) return arr[0]-'0';
        Arrays.sort(arr);
        int y=(arr[arr.length-1]-'0')*(arr[arr.length-2]-'0');
        return y;
        
    }
}