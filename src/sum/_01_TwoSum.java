package sum;

import java.util.HashMap;
import java.util.Map;

public class _01_TwoSum {
	//暴力
//	public int[] twoSum(int[] nums, int target) {
//		int[] ans = new int[2];
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//
//					ans[0] = nums[i];
//					ans[1] = nums[j];
//					return ans;
//				}
//			}
//		}
//		return null;
//	}

	//優化
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> map=new HashMap<>();
    	int []ans=new int[2];
    	for (int i = 0; i < nums.length; i++) {
			if(map.get(target-nums[i])!=null) {
				ans[0]=map.get(target-nums[i]);
				ans[1]=i;
				return ans;
			}else {
				map.put(nums[i], i);
			}
		}
    	return null;
    }
}
