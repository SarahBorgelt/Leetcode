class Solution {
    public int[] getConcatenation(int[] nums) {
        //Set a variable n equal to the length of nums
        int n = nums.length;

        //Set ans[] equal to twice the length of n
        int ans[] = new int[2 * n];

        /*For each number less than the length of n
        run through the loop and assign index i in 
        the ans array equal to the position of index i 
        in the nums array. 
        
        Add n (the length of num) to ans[] at index i to
        run through the array again*/
        for(int i =0; i<n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        } return ans;
    }
}