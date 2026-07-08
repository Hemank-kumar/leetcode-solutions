class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0,j=0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
        // return seq(s,t,0,0);
    }
    // private boolean seq(String s, String t,int i, int j){
    //     if(i == s.length()) return true;
    //     else if(j == t.length()) return false;
    //     if(s.charAt(i) == t.charAt(j)){
    //         return seq(s,t,i+1,j+1);
    //     }
    //     return seq(s,t,i,j+1);
    // }
}
