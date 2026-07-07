function replaceElements(arr: number[]): number[] {
    const len : number = arr.length;
    let max = -1;
    for(let i = len-1;i>=0;i--){
        let curVal = arr[i];
        arr[i] = max;
        if(max < curVal){
            max = curVal;
        }
    }
    return arr;
};
