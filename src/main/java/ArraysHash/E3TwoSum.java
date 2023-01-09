package ArraysHash;

import java.util.HashMap;

public class E3TwoSum {


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public int[] twoSum2(int[] nums, int target) {
        // valor - index
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int resta = target - nums[i];
            if (!hs.containsKey(resta)) {
                hs.put(nums[i], i);
            } else {
                return new int[]{hs.get(resta), i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arreglo = new int[]{2, 7, 11, 15};
        E3TwoSum o = new E3TwoSum();
        o.twoSum(arreglo, 9);
    }
}
