class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1); //coz the term is dependent on previous terms
        String ans = ""; //string is immutable
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int len = j-i; //for last term
        ans+=len;
        ans+=s.charAt(i);
        return ans;
    }
}