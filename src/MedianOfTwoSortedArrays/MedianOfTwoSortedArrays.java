package MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int[] interpolated = new int[nums1.length+nums2.length];
       int i = 0;
       int j = 0;
       int iterator = 0;

           while(i < nums1.length && j < nums2.length)
           {
               if(nums1[i] < nums2[j])
               {
                   interpolated[iterator] = nums1[i];
                   i++;
                   iterator++;
               }
               else
               {
                   interpolated[iterator] = nums2[j];
                   j++;
                   iterator++;
               }
           }
           while(i < nums1.length)
           {
               interpolated[iterator] = nums1[i];
               i++;
               iterator++;
           }
           while(j < nums2.length)
           {
               interpolated[iterator] = nums2[j];
               j++;
               iterator++;
           }
       if(interpolated.length % 2 == 1)
       {
           return (double) interpolated[interpolated.length/2];
       }
       return ((double)interpolated[interpolated.length/2] + (double)interpolated[interpolated.length/2 -1]) / 2.0;
    }
}
