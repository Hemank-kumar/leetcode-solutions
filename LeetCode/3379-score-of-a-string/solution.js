/**
 * @param {string} s
 * @return {number}
 */
var scoreOfString = function(s) {
        return calc(s,0);
    }
   function calc(s,i){
        if(i === s.length-1){
            return 0;
        }
        let diff = Math.abs(s.charCodeAt(i) - s.charCodeAt(i+1));
        return diff + calc(s,i+1);
    }

