class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsPtr = 0; 
        int numsSize = nums.length;
        int result[] = new int[numsSize*2];

        for(int i = 0; i < result.length; i++){
            result[i] = nums[numsPtr];
             numsPtr++;
             
            if(numsPtr == numsSize){
                numsPtr = 0;
            }
           
        }
        return result;
    }
}