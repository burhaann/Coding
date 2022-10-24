import java.util.HashMap;
import java.util.Arrays;

class Solution {

     public static void main(String args[]){

        Solution solve = new Solution();


        int[] n = {2, 7, 11, 15};
        int target = 9;

        int[] result = solve.twoSum(n, target);
        Arrays.sort(result);
         
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap Elements = new HashMap();

        for (int i = 0; i < nums.length; i++){
            if (Elements.containsKey(nums[i])){
                int element = (int)Elements.get(nums[i]);
                return new int[]{i,element};
                }
            else{
                Elements.put(target-nums[i],i);
                }
            }
            return null;
        }
}