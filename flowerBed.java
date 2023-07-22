class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
        {
            return true;
        }
        int count=0;
        for(int i=0;i<flowerbed.length;i++)
        {                          //checks either of it is true or not,returns if any one of them is T while ignoring other condition
            if(flowerbed[i]==0 && (i==0||flowerbed[i-1]==0) && (i==flowerbed.length-1||flowerbed[i+1]==0))
            {
                count++;
                if(count==n)
                {
                    return true;
                }
                i++;
            }
        }return false;
    }
}
