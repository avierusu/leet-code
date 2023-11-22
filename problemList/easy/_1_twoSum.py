class Solution(object):
    '''
    Old solution:
    
    def twoSum(self, nums, target):
        for num1 in range(len(nums)-1):
            for num2 in range(num1+1, len(nums)):
                if nums[num1] + nums[num2] == target:
                    return [num1, num2];
        
        return [];
    '''
    def twoSum(self, nums, target):
        numLocations = {};

        for index in range(len(nums)):
            complement = target - nums[index];
            if complement in numLocations:
                return [index, numLocations[complement]];
            else:
                numLocations[nums[index]] = index;
        
        return [];