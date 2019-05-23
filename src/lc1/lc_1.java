package lc1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author yudong
 * @create 2019-05-23 15:32
 */
public class lc_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int t = target - nums[i];
            if(map.containsKey(t) && map.get(t) != i){
                res[0] = i;
                res[1] = map.get(t);
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc_1 l = new lc_1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = l.twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
