class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0, maxFruits = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();

        for (int end = 0; end < fruits.length; end++) {
            basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);

            while (basket.size() > 2) { // More than 2 types, shrink window
                basket.put(fruits[start], basket.get(fruits[start]) - 1);
                if (basket.get(fruits[start]) == 0) {
                    basket.remove(fruits[start]);
                }
                start++; // Move window forward
            }

            maxFruits = Math.max(maxFruits, end - start + 1);
        }
        return maxFruits;
    }
}
