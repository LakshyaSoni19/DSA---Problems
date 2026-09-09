class Solution {
    public long countCommas(long n) {
        long result = 0;
        long commaStart = 1000;

        while(commaStart <= n){
            result = result + n -commaStart +1;
            commaStart = commaStart * 1000;
        }
        return result ; 
    }
}