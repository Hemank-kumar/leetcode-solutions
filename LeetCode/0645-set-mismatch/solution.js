var findErrorNums = function(nums) {
    let freq = new Array(nums.length + 1).fill(0);
    let duplicate, missing;

    for (let num of nums) {
        freq[num]++;
    }

    for (let i = 1; i <= nums.length; i++) {
        if (freq[i] === 2) duplicate = i;
        if (freq[i] === 0) missing = i;
    }

    return [duplicate, missing];
};

