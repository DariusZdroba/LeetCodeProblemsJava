import CarFleet.CarFleet;
import SearchInRotatedSortedArray.SearchInRotatedArray;


public class Main {
    public static void main(String[] args) {
    int[] position = {0,2,4};
    int[] speed = {4,2,1};
    System.out.println(CarFleet.carFleet(100, position, speed));
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8;
        System.out.println(SearchInRotatedArray.search(nums, target));
    }


}