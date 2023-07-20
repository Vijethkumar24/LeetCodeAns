class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0,j=0,i=0;
        if(s.length()==0 && s.contains(""))
        {
            return true;
        }
        for(i=0;i<t.length();i++)
        {
                if(s.charAt(j)==(t.charAt(i)))
                {
                    count++;
                    if(s.length()==count)
                    {
                        return true;
                    }
                    else
                    j++;
                }     
        }
        return false;
    }
}
