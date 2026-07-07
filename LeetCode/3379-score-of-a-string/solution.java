class Solution {
    public int scoreOfString(String s) {
       return calc(s,0);
    }
    private int calc(String s, int idx){
        if(idx == s.length()-1){
            return 0;
        }
        int diff = Math.abs(s.charAt(idx) - s.charAt(idx+1));
        return diff + calc(s,idx+1);
    }
}
