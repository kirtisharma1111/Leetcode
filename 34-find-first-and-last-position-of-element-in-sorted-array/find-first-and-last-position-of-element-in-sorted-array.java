class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //step 1 -> check if element is presnt
        int n = nums.length;
        int lo,hi;
        lo=0;hi=n-1;
        boolean flag = false; //means not present
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                flag = true;
                break;
            }
            else if(nums[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        if(flag==false) return ans;
        //step 2 -> find lower bound
        int lb = n;
        lo=0; hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        ans[0]=lb;
        //step 3 -> find upper bound
        int ub = n;
        lo = 0; hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]>target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else lo = mid+1;
        }
        ans[1]=ub-1;
        return ans;
    }
}