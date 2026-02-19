class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa,ta);
    }
}
