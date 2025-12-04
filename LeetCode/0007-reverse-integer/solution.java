class Solution {
    public int reverse(int x) {
        int rNum = 0;
        int temp = x;
        while(temp!=0){
            int digit = temp%10;
            if(rNum < Integer.MIN_VALUE / 10 || rNum > Integer.MAX_VALUE / 10){
            return 0;
             }
            rNum = rNum*10 + digit;
            temp = temp/10;
        }
        
        return rNum;
    }
}
