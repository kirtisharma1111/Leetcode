class Solution {
    public boolean isLess(int[] nums,int mid,int threshold){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0) sum+=nums[i]/mid;
            else sum+=nums[i]/mid + 1;
        }
        if(sum<=threshold) return true;
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            mx = Math.max(mx,nums[i]);
        }
        int d = 1;
        int lo = 1, hi = mx; //divisor start from 1 and go till the max value of array
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isLess(nums,mid,threshold)){
                d=mid;
                hi=mid-1;
            }
            else lo = mid+1;
        }
        return d;
    }
}