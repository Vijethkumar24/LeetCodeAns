class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> KidsWithCandies=new ArrayList<Boolean>();
        int maxCandies=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(maxCandies<candies[i])
                maxCandies=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=maxCandies)
                KidsWithCandies.add(true);
            else
                KidsWithCandies.add(false);
        }
        return KidsWithCandies;
    }
}
