class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0, mid = 0, hi = n-1;
        while(mid<=hi){
            if(nums[mid]==0){
                swap(nums,lo,mid);
                lo++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,hi);
                hi--;
            }
        }
    }
}