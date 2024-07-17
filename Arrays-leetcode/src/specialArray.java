//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

class Solution {
    public int specialArray(int[] nums) {
        int[] count = new int[nums.length+1];
        for(int i : nums){
            if(i>nums.length){
            count[nums.length]++;
        }else{
            count[i]++;
        }
        }
        int sum =0;
        for(int i=nums.length; i>=0; i--){
            sum += count[i];
            if(sum == i) return i;
        }
        return -1;

    }
}