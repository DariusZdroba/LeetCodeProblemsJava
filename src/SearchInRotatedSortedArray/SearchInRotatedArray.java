package SearchInRotatedSortedArray;

public class SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        while(left <= right )
        {
            int mid = (left+right) / 2;
            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid])
            {
                if(nums[left] <= target && target < nums[mid])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            else
            {
                if(nums[right] >= target && target > nums[mid])
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
