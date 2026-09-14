class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int left = 0; 
        int right = n;
        int index = 0;

        int size = nums.length;

        int result[] = new int[size]; 
        while(right < nums.length){
            result[index] = nums[left];
            index++;

            result[index] = nums[right];
            index++;

             left ++;
             right++;
        }
        
        
        return result;
    }
}