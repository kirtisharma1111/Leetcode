class Solution {
    public boolean isPalindrome(int x) {
        int duplicate = x;
        int reverseNum = 0;
        while(x>0){
            int lastDigit = x%10;
            x/=10;
            reverseNum = reverseNum*10 + lastDigit;
        }
        if(reverseNum == duplicate)  return true;
        else return false;
        
    }
}