class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #If there are no numbers in nums, return 0.
        if not nums:
            return 0
        
        #Because the first number is always unique, we can start at index 1 instead of 0. To begin, we set i equal to index 1.
        i = 1

        #j will act as a pointer that moves through the array from index 1 to the length of the num array.
        for j in range(1, len(nums)):
            #If the nums array at index j is not equal to the nums array at the previous index (j-1), then it may be added to i. Whenever this occurs, i will increase by 1 to change the index for the next iteration.
            if nums[j] != nums[j-1]:
                nums[i]=nums[j]
                i+=1
        return i
