 /**
     Example 1:

    Input: nums = [3,1,-2,-5,2,-4]
    Output: [3,-2,1,-5,2,-4]
    Explanation:
    The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
    The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
    Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        // first we have to devide the array into two part one containing positive integers
        // another cosisting negative integers
        // Time coplexity O(n).
       
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        
        int i = 0;
        for(int num : nums){
            if(num > 0){
                pos[i]=num;
                i++;
            }
        }
        int j = 0;
        for(int num : nums){
            if(num < 0){
                neg[j] = num;
                j++;
            }
        }
        int[] res = new int[n];
       
        # merging an array which is rearrage by sign properly.
        int secIdx = 1;
        int track = 0;
        for(int firstIdx = 0; firstIdx < n; firstIdx = firstIdx + 2){
            res[firstIdx] = pos[track];
            res[secIdx] = neg[track];
            secIdx = secIdx + 2;
            track++;
        }
        return res;
    }
}
