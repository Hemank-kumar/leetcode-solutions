var countOdds = function(low, high) {
    let count = Math.floor((high - low) / 2);

    if (low % 2 !== 0 || high % 2 !== 0) {
        count++;
    }

    return count;
};

