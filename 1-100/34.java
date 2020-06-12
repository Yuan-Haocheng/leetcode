class Solution {
    private int rangeBinarySearch(int[] nums, int target, boolean left){
        int len=nums.length;
        int lo=0, hi=len;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if (nums[mid]>target || left && nums[mid]==target){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        
        return lo;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] r={-1,-1};
        if (nums.length==0){
            return r;
        }
        
        int leftb=rangeBinarySearch(nums, target, true);
        
        if (leftb==nums.length || nums[leftb]!=target){
            return r;
        }
        
        int rightb=rangeBinarySearch(nums, target, false)-1;
        r[0]=leftb;
        r[1]=rightb;
        
        return r;
        
        
    }
}
