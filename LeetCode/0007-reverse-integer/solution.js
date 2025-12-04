/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let rnum = 0;
    let temp = x;

    while (temp !== 0) {
        let digit = temp % 10;              // extract last digit
        rnum = rnum * 10 + digit;           // build reversed number
        temp = Math.trunc(temp / 10);       // remove last digit
    }

    // 32-bit signed integer range check
    if (rnum < -(2**31) || rnum > (2**31 - 1)) {
        return 0;
    }

    return rnum;
};
