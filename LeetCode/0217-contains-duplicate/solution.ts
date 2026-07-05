function containsDuplicate(nums: number[]): boolean {
   let set = new Set<number>();
   for(let ele of nums){
        if(set.has(ele)){
            return true;
        }
        set.add(ele);
   }
   return false;
};
