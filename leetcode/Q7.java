// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
// ------------------------------------------
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1 = m - 1;
        int p2 = n - 1;
        int idx = nums1.length - 1;

        while(p1 >= 0 || p2 >= 0){
            int v1 = (p1 >= 0) ? nums1[p1] : Integer.MIN_VALUE;
            int v2 = (p2 >= 0) ? nums2[p2] : Integer.MIN_VALUE;

            if(v1 <= v2){
                nums1[idx] = v2;
                p2--;
            }else{
                nums1[idx] = v1;
                p1--;
            }

            idx--;
        }
    }  
}