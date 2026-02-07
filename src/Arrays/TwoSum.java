package Arrays;

//public class TwoSum {
//    public static void main(String[] args) {
//        System.out.println("two sum");
//    }
//    public static boolean twoSum(int arr[], int target){
//        int n = arr.length;
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                if(arr[i] + arr[j] == target)
//                    return true;
//            }
//        }
//        return false;
//    }
//}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        boolean result = twoSum(nums, target);
        System.out.println("Two sum exists: " + result);
    }

    public static boolean twoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}
