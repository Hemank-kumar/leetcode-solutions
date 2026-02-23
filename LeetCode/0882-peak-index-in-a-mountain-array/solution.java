class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int u = arr.length - 1;
        while(l < u){
            int mid = l + ( u - l)/2;
            if(arr[mid] > arr[mid+1]){
                u = mid;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
}
