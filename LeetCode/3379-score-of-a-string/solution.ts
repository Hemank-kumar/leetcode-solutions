function scoreOfString(s: string): number {
     return calc(s,0)

};
function calc(s,i){
        if(i === s.length-1){
            return 0;
        }
        let diff = Math.abs(s.codePointAt(i) - s.codePointAt(i+1));
        return diff + calc(s,i+1);
    }
