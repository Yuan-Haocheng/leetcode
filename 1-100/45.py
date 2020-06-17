class Solution:
    def jump(self, nums: List[int]) -> int:
        length = len(nums)
        times=0
        i = 0
        while (i<length-1):
            max_c = float('-inf')
            next_p = i
            for j in range(i+1, min(i + nums[i]+1, length)):
                if j==length-1:
                    return times+1
                c = nums[j] - length + j + 1
                if c > max_c:
                    max_c = c
                    next_p = j
            i = next_p
            times+=1
        
        return times
