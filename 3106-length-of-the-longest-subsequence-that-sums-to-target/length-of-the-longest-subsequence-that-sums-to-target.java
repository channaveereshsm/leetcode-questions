class Solution {
    int dp[][];
    public int find(List<Integer> l,int target,int i)
    {
        if(target==0)
        return 0;
        if(i==l.size())
        return -1000;
        if(target<0)
        return -1000;
        int a=-1000;
        if(dp[i][target]!=0)
        return dp[i][target];
        if(target>=l.get(i))
        a=1+find(l,target-l.get(i),i+1);
        a=Math.max(find(l,target,i+1),a);
        return dp[i][target]=a;

    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
    Collections.sort(nums);
    dp=new int[nums.size()+1][target+1];
    int ans=find(nums,target,0);
    if(ans<0)
    return -1;
    return ans;
    }
}