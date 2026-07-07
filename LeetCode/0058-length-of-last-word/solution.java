class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.trim().toCharArray();
        int sum = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] != ' '){
                sum += 1;
            }else{
                break;
            }
        }
        return sum;
    }
}
