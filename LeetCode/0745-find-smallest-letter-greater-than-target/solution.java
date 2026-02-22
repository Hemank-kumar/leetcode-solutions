class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int u = letters.length-1;
        while(l <= u){
            int mid = l + ( u - l)/2;
            if(letters[mid] > target){
                u = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return letters[l % letters.length ];
    }
}
