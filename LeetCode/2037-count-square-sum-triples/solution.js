/**
 * @param {number} n
 * @return {number}
 */
var countTriples = function(n) {
    let count = 0;

    for (let a = 1; a <= n; a++) {
        for (let b = a + 1; b <= n; b++) {
            let c2 = a*a + b*b;
            let c = Math.trunc(Math.sqrt(c2));
            if (c <= n && c * c === c2) count+=2;
        }
    }

    return count;
};

