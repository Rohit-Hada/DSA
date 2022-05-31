// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int maxOpt = nums[0];
        int opt = nums[0];
        for(int i = 1;i < nums.length;++i) {
            if(opt > 0) opt = nums[i] + opt;
            else opt = nums[i];
            
            maxOpt = Math.max(opt, maxOpt);
        }
        
        return maxOpt;
    }
}
// -----------------------------------
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
      for(int sp = 0; sp < nums.length; sp++){
          int subArraySum = 0;
          for(int ep = sp; ep < nums.length; ep++){
              subArraySum += nums[ep];
            //   System.out.println(sp+"-"+ep+"sum :"+subArraySum)
            max = Math.max(max,subArraySum);  
        }
      }
      return max;
    }
}