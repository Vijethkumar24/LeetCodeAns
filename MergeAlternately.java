class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newword="";
        if(word1.length()==word2.length())
        {
            for(int i=0;i<word1.length();i++)
            {
                newword+=String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i));
            }
        }
        if(word1.length()<word2.length())
        {
            int j=0;
            for(int i=0;i<word1.length();i++)
            {
                newword+=String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i));
                j++;
            }
            newword+=word2.substring(j,word2.length());
        }
        if(word1.length()>word2.length())
        {
            int j=0;
            for(int i=0;i<word2.length();i++)
            {
                newword+=String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i));
                j++;
            }
            newword+=word1.substring(j,word1.length());
        }
       return newword;
    }
}
