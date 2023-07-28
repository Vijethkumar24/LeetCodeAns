class Solution {
    public int pivotIndex(int[] nums) {
        int i=0,leftSum=0,rightSum,totalSum=0;
        for(i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
        for(i=0;i<nums.length;i++)
        {
            rightSum=totalSum-nums[i]-leftSum;
            if(leftSum==rightSum)
                return i;
            else
                leftSum+=nums[i];
        }
        return -1;
    }
}
