"""
Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
"""

class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        boolArray = [False] * (n+1)
        
        for num in nums:
            boolArray[num] = True
        
        ans = 0
        for i in range(len(boolArray)):
            if boolArray[i] == False :
                ans = i
        return ans
