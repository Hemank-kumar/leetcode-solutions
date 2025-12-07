/**
 * @param {number[]} target
 * @param {number} n
 * @return {string[]}
 */
var buildArray = function(target, n) {
    let operations = [];
    let current = 1; // number coming from the stream

    for (let value of target) {
        // Push & Pop for numbers we don't need
        while (current < value) {
            operations.push("Push");
            operations.push("Pop");
            current++;
        }

        // Push for the number we need
        operations.push("Push");
        current++;
    }

    return operations;
};

