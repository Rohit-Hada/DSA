// 118. Pascals's Triangle
// https://leetcode.com/problems/pascals-triangle/submissions/

class Solution {
    
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i< n;i++){
            int val = 1;
            List<Integer> temp = new ArrayList<>();
        for(int j =0;j<=i;j++){
            temp.add(val);
            val = (val)*(i-j)/(j+1);
        }
            ans.add(temp);
        }
        return ans;
    }
}