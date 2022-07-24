package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _26_RemoveDuplicatesfromSortedArray {

	//brute
	public int removeDuplicates1(int[] nums) {
		// O(N)
		Set <Integer>set=new LinkedHashSet();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);	
		}
		int i=0;
		for (int num: set) {
			nums[i++]=num;
		}
		return set.size();
	}
	public int removeDuplicates(int[] nums) {
		// O(N)
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if(nums[count]!=nums[i]) {
                count++;
				nums[count]=nums[i];
			}
		}
		return count+1;
	}
}
