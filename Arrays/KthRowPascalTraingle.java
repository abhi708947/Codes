/*Problem Description

Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example:

Input : k = 3


Return : [1,3,3,1]


approach : we have to return k th row after processing on k-1 th row, so have two arraylists one storing k-1 th and one storing kth.
*/
public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> add = new ArrayList<>();
       ArrayList<Integer> send = null;
        if(A==0){
            add.add(1);
            return add;
        }
        if(A==1){
            add.add(1);
            add.add(1);
            return add;
        }
        
        add.add(1);
        add.add(1);
        A=A-1;
        while(A>0){
         send = new ArrayList<>();
         send.add(1);
         for(int i=0;i<add.size()-1;i++){
             send.add(add.get(i)+add.get(i+1));
 
         }
         send.add(1);
         A--;
         
         add = send;
         
        }
        
        return send;
    }
}
