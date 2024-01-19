import CarFleet.CarFleet;
import MedianOfTwoSortedArrays.MedianOfTwoSortedArrays;
import SearchInRotatedSortedArray.SearchInRotatedArray;
import TimeMap.TimeMap;


public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(MedianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2));
        TimeMap map = new TimeMap();
        map.set("love","high",10);
        map.set("love","low",20);
        System.out.println(map.get("love", 5));
        System.out.println(map.get("love", 10));
        System.out.println(map.get("love", 15));
        System.out.println(map.get("love", 20));
        System.out.println(map.get("love", 25));

        int[] position = {0,2,4};
    int[] speed = {4,2,1};
    System.out.println(CarFleet.carFleet(100, position, speed));
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8;
        System.out.println(SearchInRotatedArray.search(nums, target));
    }


}