function appendCharacters(s: string, t: string): number {
    let i =0;
    let j =0;
    while(i <s.length ){
        if(s[i] == t[j]){
            j++;
        }
            i++;
        
    }
    return t.length - j;
};
