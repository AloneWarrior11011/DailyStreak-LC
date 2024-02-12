"""
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
"""

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        hmp = {}

        for i in nums:
            hmp[i] = hmp.get(i, 0)+1

        ans = 0
        for key,value in hmp.items():
            if value > n/2:
                ans = key
        
        return ans

