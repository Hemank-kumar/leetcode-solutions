class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for (String s : strs) {

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (hm.containsKey(key)) {
                hm.get(key).add(s);
            } else {
                hm.put(key, new ArrayList<>());
                hm.get(key).add(s);
            }
        }

        ans.addAll(hm.values());
        return ans;
    }
}
