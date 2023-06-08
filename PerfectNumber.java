class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int i;
        if(num%2!=0)
        return false;
     for(i=1;i<=num/2;i++)
     {
         if(num%i==0)
         {
           sum=sum+i;
         }continue;
     }
     if(sum==num)
     {
         return true;
     }
     else return false;
    }
}
