class Solution {
    public boolean isPossible(int[] quantities, int maxQ, int n){
        int storesTaken = 0;
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]%maxQ==0) storesTaken+=quantities[i]/maxQ;
            else storesTaken+=quantities[i]/maxQ+1;
        }
        if(storesTaken>n) return false;
        else return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int m = quantities.length, mx = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx = Math.max(quantities[i],mx);
        }
        int lo = 1, hi = mx; //capacity 1 se lekr maximun number jo quantity k hai wahan tak jayegi
        int ans = 0; //jo value humein fill krni hai
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(quantities,mid,n)){ //no of stores present
            ans = mid;
            hi=mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}