class HouseRobber2 {
    public int robHelp(int[]nums){
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[1],nums[0]);
        int[]dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<n;i++){
            int case1=dp[i-2]+nums[i];
            int case2=dp[i-1];
            dp[i]=Math.max(case1,case2);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        int n=nums.length;
        int[]arr1=new int[n-1];
        int[]arr2=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i+1];
        }
        int ans1 = robHelp(arr1);
        int ans2 = robHelp(arr2);
        return Math.max(ans1,ans2);
    }
}