class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int l=0,r=n-1;
       for(int num:nums) {
        if(num%2==0) ans [l++]=num;
        else ans[r--]=num;
       }
      return ans;  
    }
}