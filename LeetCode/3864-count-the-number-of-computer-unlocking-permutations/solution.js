/**
 * @param {number[]} complexity
 * @return {number}
 */
var countPermutations = function(complexity) { // [0, 1, 2]
    //n = complexity.length - passwords
    //complexity[i] - complexity of ith password
    //complexity[0] - root password
    //complexity[j] < complexity[i] to unlock ith 
    const mod = 10**9 + 7;
    let ans = 1;
    let n = complexity.length;
    let root = complexity[0]; // root
    for (let i = 1; i < n; i++) {
        // root (complexity[0]) should be < complexity[i] to unlock ith
        // if complexity[i] <= root we can't unlock
        if (complexity[i] <= root) return 0; 
    }
    //using factorial for arbitrary combinations
    for (let i = 2; i < n; i++) {
        ans = (ans * i) % mod;
    }
    return ans;
};
