class Solution {
    public boolean isAnagram(String s, String t) {
        int CharFrequency[]=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            CharFrequency[s.charAt(i)-'a']++;
            CharFrequency[t.charAt(i)-'a']--;
        }
        for(int i=0;i<CharFrequency.length;i++)
        {
            if(CharFrequency[i]!=0)
            {
                return false;
            }
        }return true;
    }
}
