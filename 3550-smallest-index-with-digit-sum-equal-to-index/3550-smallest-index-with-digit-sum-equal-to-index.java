class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i < nums.length; i++){
           int number = nums[i];
           int digitSum = 0;

           while(number > 0){
            digitSum +=number %10 ; 
            number = number /10;
           }
           if(digitSum == i)    return i;
        }
        
        return -1;
    }
}