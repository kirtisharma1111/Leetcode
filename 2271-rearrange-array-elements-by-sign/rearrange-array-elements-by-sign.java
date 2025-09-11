class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for(int ele : nums){
            if(ele>0){
                ans[posIndex]=ele;
                posIndex += 2;
            }else{
                ans[negIndex] = ele;
                negIndex +=2;
            }
        }
        return ans;
    }
}