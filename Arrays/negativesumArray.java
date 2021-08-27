public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        pair fi =  new pair(0, -1, 0);
        pair tmp = new pair(0, -1, 0);

        for(int i=0; i<A.size(); i++){
            //System.out.println("tmp"+tmp.start);
            if( (tmp.sum + A.get(i)) >= tmp.sum ){
                tmp.end = i;
                tmp.sum = tmp.sum + A.get(i);
            }else{
                // negative number
                if(fi.sum < tmp.sum){
                    fi = tmp;
                }else if(fi.sum == tmp.sum){
                    // if 0
                    if(fi.end==-1 || Math.abs(fi.start-fi.end) <= Math.abs(tmp.start-tmp.end)){
                        fi = tmp;
                    }
                }
                tmp = new  pair(i+1, -1, 0);
            }
        }
        if(fi.sum < tmp.sum){
                fi = tmp;
            }else if(fi.sum == tmp.sum){
                // if 0
                if(fi.end==-1 || Math.abs(fi.start-fi.end) <= Math.abs(tmp.start-tmp.end)){
                    fi = tmp;
                }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(fi.end!= -1){
            for(int i=fi.start; i<=fi.end; i++){
                ans.add(A.get(i));
            }
        }
        return ans;
    }
}

class pair{
    int start;
    int end;
    long sum;

    public pair(int s, int e, int sum){
        this.start = s;
        this.end = e;
        this.sum = sum;
    }
}
