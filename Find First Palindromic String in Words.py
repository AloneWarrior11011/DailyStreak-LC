"""
Example 1:
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

"""
class Solution(object):
    def firstPalindrome(self, words):
        """
        :type words: List[str]
        :rtype: str
        """
        for i in range(len(words)):
            curr = words[i]
            rev = ""
            for char in reversed(curr):
                rev += char
            if curr == rev :
                return curr
        return ""
      
