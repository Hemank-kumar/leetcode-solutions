/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let temp = x;
    let num = 0;
    while(x>0){
        let digit = x%10;
        num = num*10 + digit;
        x = Math.floor(x/10);
    }
    if(temp === num){
        return true;
    }else if(temp != num){
        return false
    }
};
