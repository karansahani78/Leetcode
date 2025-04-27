class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        for (int i = 0; i < 2 * n; i++) { // <-- 2n iterations to simulate circular array
            int num = nums[i % n]; // circular indexing
            while (!stack.isEmpty() && num > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = num;
            }
            if (i < n) { // Only push the index during the first pass
                stack.push(i);
            }
        }
        
        return result;
    }
}
