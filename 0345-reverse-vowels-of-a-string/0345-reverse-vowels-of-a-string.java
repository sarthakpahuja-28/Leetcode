
class Solution {
    public  boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
     int left=0;
     int right=s.length()-1;
     char [] arr=s.toCharArray();
     while(left<right){
        char a=arr[left];
        char b=arr[right];
        if(isVowel(a) && isVowel(b)){
            char temp=a;
            arr[left]=b;
            arr[right]=temp;
            left++;
            right--;
        }
        else if(isVowel(a) && !isVowel(b)){
            right--;
        }
        else if(!isVowel(a) && isVowel(b)){
            left++;
        }
        else{
            left++;
            right--;
        }
     }
     String x=new String(arr);
     return x;
   }
}