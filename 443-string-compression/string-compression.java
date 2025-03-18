class Solution {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder("");
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]==arr[i]) j++;
            else{
                ans.append(arr[i]); //alphabet
                int len = j-i; //length of alphabet
                if(len>1) ans.append(len);
                i=j;
            }
        }
            //to include last alphabet
            ans.append(arr[i]); //alphabet
            int len = j-i; //length of alphabet
            if(len>1) ans.append(len);
            for(i=0;i<ans.length();i++){
                arr[i]=ans.charAt(i);
            }
        return ans.length();
    }
}