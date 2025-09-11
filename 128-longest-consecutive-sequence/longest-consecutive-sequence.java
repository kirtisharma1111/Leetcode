class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int maxLength = 0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int currentEle = ele;
                int currentLen = 1;
                while(set.contains(currentEle+1)){
                    currentEle++;
                    currentLen++;
                }
                maxLength = Math.max(currentLen,maxLength);
            }
        }
        return maxLength;
    }
}