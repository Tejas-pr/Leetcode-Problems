class Solution {
    public int[] twoSum(int[] nums, int target) {
        int y = nums.length;
        for(int i=0;i<y;i++){
            for(int j=i+1;j<y;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}