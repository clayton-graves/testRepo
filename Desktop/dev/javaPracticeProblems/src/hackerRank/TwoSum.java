package hackerRank;
/* Return the two indices that add up to the specific target */
public class TwoSum {
    public static void main(String[] args){
        test();
    }
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + i; j < nums.length; j++){
                if(nums[j] == target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void test(){
        int[] testCase = new int[]{1,2,3,4,5,6,7};
        twoSum(testCase, 6);
    }
}
