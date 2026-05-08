class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resutl = new int[2];
        int flag = 0;
        for(int i = 0; i < nums.length - 1 ; i++){
            for(int j = i + 1 ; j < nums.length; j ++){
                if(nums[i] + nums[j] == target ){
                    resutl[flag] = i;
                    flag++;
                    resutl[flag] = j;
                    break;
                }
            }
        }
        return resutl;
    }
}
