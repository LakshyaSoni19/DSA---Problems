class Solution {
    public int strStr(String haystack, String needle) {
       for (int startIndex = 0;
             startIndex <= haystack.length() - needle.length();
             startIndex++) {

            int needleIndex = 0;

            while (needleIndex < needle.length()
                    && haystack.charAt(startIndex + needleIndex) == needle.charAt(needleIndex)) {

                needleIndex++;
            }

            if (needleIndex == needle.length()) {
                return startIndex;
            }
        }

        return -1;
    }
}