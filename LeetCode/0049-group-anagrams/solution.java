class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(map.containsKey(temp)){
                List<String> ls = map.get(temp);
                ls.add(str);
                map.put(temp, ls);
            } else{
                List<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(temp, ls);
            }
        }

        for(var value : map.values()){
            res.add(value);
        }

        return res;
    }
}
