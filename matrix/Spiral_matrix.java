//  link to question 
//  https://leetcode.com/problems/spiral-matrix/

/* Approach:
       we know one thing we have to iterate through all elements of matrix,so have a outer loop that keeps track of no of elements,
       now we know direction will always be right then down then left then up,and mark visited elements as 101.*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int cnt = 0;
        int i=0;
        int j=0;
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        
        while(cnt<row*col){
            
            //right
            while(j<col && matrix[i][j]!=101){
                ans.add(matrix[i][j]);
                cnt++;
                matrix[i][j] = 101;
                j++;
                
                
                
            }
            j--;
            i++;
            
            //down
            while(i<row && matrix[i][j]!=101){
                ans.add(matrix[i][j]);
                 cnt++;
                 matrix[i][j] = 101;
                i++;
                
            }
            
            i--;
            j--;
            //left
            while(j>=0 && matrix[i][j]!=101 ){
                ans.add(matrix[i][j]);
                 cnt++;
                 matrix[i][j] = 101;
                j--;
            }
            j++;
            i--;
            
            //up
            while(i>=0 && matrix[i][j]!=101){
                ans.add(matrix[i][j]);
                cnt++;
                 matrix[i][j] = 101;
                i--;
            }
            i++;
            j++;
            
        }
        return ans;
    }
}

