package leetTasks._017_mergeSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
  be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class Solution {


    public static void main(String[] args) {
        int [] nums1  = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3;
        int n =3;
        merge( nums1,m,nums2, n);
        System.out.println(Arrays.toString(nums1) );
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            numList.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            numList.add(nums2[i]);
        }
        Collections.sort(numList);

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = numList.get(i);
        }

    }
}
