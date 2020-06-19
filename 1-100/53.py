class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        g_m=nums[0]
        s=0
        for i in nums:
            s+=i
            if s<i:
                s=i
            if s>g_m:
                g_m=s
        
        return g_m
