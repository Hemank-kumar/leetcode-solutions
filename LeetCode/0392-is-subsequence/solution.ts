function isSubsequence(s: string, t: string): boolean {
    const rec = (i,j) => {
        if(i == s.length) return true;
        if(j == t.length) return false;
        if(s.charAt(i) == t.charAt(j)){
            return rec(i+1,j+1);
        }
        return rec(i,j+1);
    }
    return rec(0,0);
};


