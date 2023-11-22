import java.util.HashMap;

class Solution {
    /*
    Old solution:
    
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        
        for(int num1 = 0; num1 < nums.length-1; num1++){
            for(int num2 = num1+1; num2 < nums.length; num2++){
                if(nums[num1] + nums[num2] == target){
                    solution[0] = num1;
                    solution[1] = num2;
                }
            }
        }
        
        return solution;
    }
    */
    public int[] twoSum(int[] nums, int target) {
        HashMap numLocations = new HashMap();
        
        for(int index = 0; index < nums.length; index++){
            int complement = target - nums[index];
            
            if(numLocations.containsKey(complement))
                return new int[]{index, (int) numLocations.get(complement)};
            else
                numLocations.put(nums[index], index);
        }

        return new int[]{};
    }
}