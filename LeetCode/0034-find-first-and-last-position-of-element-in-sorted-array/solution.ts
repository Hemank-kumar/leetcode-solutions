function searchRange(nums: number[], target: number): number[] {
    return [findFirst(nums,target), findLast(nums,target)]
};
function findFirst(nums:number[],target:number){
        let start = 0;
        let end = nums.length - 1;
        let mid = Math.floor(start + (end - start)/2);
        let ans = -1;

        while(start <= end){
            if(nums[mid] == target ){
                ans = mid;
                end = mid-1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            mid = Math.floor(start + (end - start)/2);
        }
        return ans;
    };

    function findLast(nums: number[] , target:number){
        let start = 0;
        let end = nums.length - 1;
        let mid ;
        let ans = -1;

        while(start <= end){
            mid = Math.floor(start + (end - start)/2);
            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    };
