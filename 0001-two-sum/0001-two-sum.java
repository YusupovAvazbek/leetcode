class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        /*
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
        */
        for(int i = 0; i < nums.length; i++){
            
            if(numsMap.containsKey(target - nums[i])){
                return new int[]{numsMap.get(target - nums[i]),i};
            }
            numsMap.put(nums[i],i);
        }
        return new int[]{};
    }
}