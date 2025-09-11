class Solution {
    public boolean isPalindrome(int x) {
        int duplicate = x;
        int reverseNum = 0;
        while(x>0){
            int lastDigit = x%10;
            x/=10;
            // if(reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && lastDigit>7)) return false;
            // if(reverseNum > Integer.MIN_VALUE/10 || (reverseNum == Integer.MIN_VALUE/10 && lastDigit<-8)) return false;
            reverseNum = reverseNum*10 + lastDigit;
        }
        if(reverseNum == duplicate)  return true;
        else return false;
        
    }
}