class Solution {
    public void moveZeroes(int[] nums) {
    int zC=0;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]!=0)
         {
            nums[zC]=nums[i];
            zC++;
         }
     }
     for(int i=zC;i<nums.length;i++)
            nums[i]=0;
    }
}
