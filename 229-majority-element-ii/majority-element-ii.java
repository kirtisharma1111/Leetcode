class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }else{
                map.put(ele,1);
            }
        }
        for(int ele:map.keySet()){
            int count = map.get(ele);
            if(count>nums.length/3){
                ans.add(ele);
            }
        }
        return ans;
    }
}