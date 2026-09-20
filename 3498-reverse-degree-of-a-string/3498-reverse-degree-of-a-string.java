class Solution {
    public int reverseDegree(String s) {
        int result = 0;

        for(int i = 0; i<s.length(); i++){
            int alphabetValue = s.charAt(i) - 'a' + 1;
            int reverseValue = 27 - alphabetValue;

            int position = i+1;

            result += reverseValue * position;
        }
        return result ; 
    }
}