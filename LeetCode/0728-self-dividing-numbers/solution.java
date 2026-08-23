class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();
        for(int i = left;i<=right;i++){
            int temp = i;
            boolean flag = false;
            while(temp > 0){
                if(temp%10 == 0 || i%(temp%10) != 0){
                    flag = true;
                    break;
                }else{
                    temp /= 10;
                }
            }
            if(!flag){
                ls.add(i);
            }
        }
        return ls;
    }
}
