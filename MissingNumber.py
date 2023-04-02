#User function Template for python3


class Solution:
    def MissingNumber(self,array,n):
        array.sort()
        if (array[0]==n):
            return (array[0]-1)
        for i in range (0,n):
                if(n-array[i]==1):
                    return (array[i]+1)
                elif(array[0]!=1):
                    return 1
                elif((array[i+1]-array[i])==1):
                    continue
                else:
                    return i+2


#{ 
 # Driver Code Starts
#Initial Template for Python 3




t=int(input())
for _ in range(0,t):
    n=int(input())
    a=list(map(int,input().split()))
    s=Solution().MissingNumber(a,n)
    print(s)
# } Driver Code Ends
