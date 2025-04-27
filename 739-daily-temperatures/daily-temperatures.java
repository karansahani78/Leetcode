class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack = new Stack<>();
        int [] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int previouseIndex = stack.pop();
                // to calculate waiting time
                result[previouseIndex] = i-previouseIndex;
            }
            stack.push(i);

        }
        return result;
        
    }
}