function containsNearbyDuplicate(nums: number[], k: number): boolean {
    const len : number = nums.length;
    let map = new Map<number,number>();
    for(let i = 0;i < len;i++){
        var num = nums[i];
        if(map.has(num) && Math.abs(i-map.get(num))<=k){
            return true;
        }
        map.set(num,i);
    }
    return false;
};
