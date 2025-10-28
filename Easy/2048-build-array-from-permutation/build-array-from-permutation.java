class Solution {
    public int[] buildArray(int[] nums) {
        //declare a new array equal to the length of nums
        int[] ans = new int[nums.length];

        //use a for loop to run through each part of nums
        for(int i = 0; i<nums.length; i++){
            // look at the value at index i (nums[i])
            // then go to that index in nums and get its value (nums[nums[i]])
            // assign that value to ans[i]
            ans[i] = nums[nums[i]];
        }
        //return the solution
        return ans;
    }
}
