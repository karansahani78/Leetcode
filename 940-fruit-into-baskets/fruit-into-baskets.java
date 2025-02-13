class Solution {
    public int totalFruit(int[] fruits) {
     int start = 0, maxFruits = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();
        for(int end = start; end<fruits.length; end++){
            basket.merge(fruits[end],1,Integer::sum);
            while(basket.size()>2){
                basket.merge(fruits[start],-1,Integer::sum);
                if(basket.get(fruits[start])==0){
                    basket.remove(fruits[start]);

                }
                start++;

            }
            maxFruits = Math.max(maxFruits,end-start+1);
        }

        return maxFruits;
    }
}