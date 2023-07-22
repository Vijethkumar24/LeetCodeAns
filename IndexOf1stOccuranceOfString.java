class Solution {
    public int strStr(String haystack, String needle) {
        int N=needle.length();
        int M=haystack.length();
        if(N==0 || N>M)
        return -1;
        for(int i=0;i<M-N+1;i++)
        {
           if(haystack.substring(i,i+N).equals(needle)){
               return i;
           }
        }
        return -1;
    }
}
