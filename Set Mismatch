/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 
*/


class Solution {
    public int[] findErrorNums(int[] nums) {
        // 38 test cases passed
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int[] ans = new int[2];
        
        Arrays.sort(nums);  // it'll make our work easy for marking is present or not and also for cnt
        for(int num : nums){
            hmp.put(num,hmp.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hmp.entrySet()){
            if(entry.getValue() > 1){
                ans[0] = entry.getKey();
            }
        }
       
       Set<Integer> notAvailableCheck = new HashSet();
       for(int num : nums){
           notAvailableCheck.add(num);
       }

       for(int i = 1; i <= nums.length; i++){
           if(!notAvailableCheck.contains(i)){
               ans[1] = i;
           }
       }
        return ans;
    }
}
