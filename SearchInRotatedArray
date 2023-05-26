class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0;
        while(low<=high)
        {
            mid=(high+low)/2;
            if(target==nums[mid])
                return mid;


            //left side sort
            if(nums[low]<=nums[mid]){
                //check whether ele lies on left half or not
                if(target>=nums[low] && target <=nums[mid]){
                    high=mid-1;
                }
                else low=mid+1;
            }

            
            //right side sort
            else{
                //check whether ele lies on left half or not
                if(target>=nums[mid]&& target<=nums[high])
                {
                    low=mid+1;
                }
                else high=mid-1;
            }
        }return -1;
    }
}
