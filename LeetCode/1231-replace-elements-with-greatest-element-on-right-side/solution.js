/**
 * @param {number[]} arr
 * @return {number[]}
 */
var replaceElements = function(arr) {
    const len = arr.length;
    let max = -1;
    for(let i = len-1;i>=0;i--){
        let curVal = arr[i];
        arr[i] = max;
        if(curVal > max){
            max = curVal;
        }
    }
    return arr;
};
