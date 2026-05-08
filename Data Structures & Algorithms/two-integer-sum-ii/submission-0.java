class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = {-1, -1};
        int f = 0;
        int l = numbers.length -1;
        while(f < l){
            if(numbers[f] + numbers[l] == target){
                arr[0] = f + 1;
                arr[1] = l + 1;
                break;
            }else if(numbers[f] + numbers[l] > target){
                l--;
            }else{
                f++;
            }
        }
        return arr;
    }
}
