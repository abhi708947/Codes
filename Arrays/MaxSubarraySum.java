/*Find the contiguous subarray within an array, A of length N which has the largest sum.

Input Format:

The first and the only argument contains an integer array, A.
Output Format:

Return an integer representing the maximum possible sum of the contiguous subarray.
Constraints:

1 <= N <= 1e6
-1000 <= A[i] <= 1000
For example:

Input 1:
    A = [1, 2, 3, 4, -10]

Output 1:
    10

Explanation 1:
    The subarray [1, 2, 3, 4] has the maximum possible sum of 10.

Input 2:
    A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Output 2:
    6

Explanation 2:
    The subarray [4,-1,2,1] has the maximum possible sum of 6.



Approach -  try adding sum,the key thing is check whether after adding a element to existing sum that sum is bigger than the element itself or not if yes then add that element to sum
if no then sum will be that element and process ahead.

*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max = A.get(0);
        int sum = A.get(0);
        for(int i=1;i<A.size();i++){
            
            if(sum+A.get(i)<A.get(i)){
                sum=A.get(i);
            }else{
                sum = sum + A.get(i);
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
