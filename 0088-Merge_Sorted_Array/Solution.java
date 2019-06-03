import java.util.*;

/*
 * 倒着放，可以避免拷贝nusm1
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
 		for(int i = m-1, j = n-1, k = m+n-1; k >= 0; k--) {
 			if(i < 0) {
 				nums1[k] = nums2[j--];
 			} else if(j < 0) {
 				nums1[k] = nums1[i--];
 			} else if(nums1[i] > nums2[j]){
 				nums1[k] = nums1[i--];
 			} else {
 				nums1[k] = nums2[j--];
 			}
 		}
    }
}