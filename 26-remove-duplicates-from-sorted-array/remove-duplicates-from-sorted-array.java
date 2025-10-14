import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        // Preserve order of first occurrences
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int index = 0;
        for (int element : set) {
            nums[index++] = element;
        }

        return set.size();
    }
}
