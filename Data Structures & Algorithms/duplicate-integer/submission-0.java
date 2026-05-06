class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        int sizeArr = nums.length;
        for(int num : nums){
            mySet.add(num);
        }
        if(mySet.size() == sizeArr){
            return false;
        }
        return true;
    }
}