class Solution {
    public int removeDuplicates(int[] nums) {
    int index=0;
    int count=1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[index]==nums[i])
        {
          continue;
        }
        nums[++index]=nums[i];
        count++;
    }
    return count;
  } 
}
