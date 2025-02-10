class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> fruitCounts = new HashMap<>();
        int start = 0, maxFruits = 0;

        for (int end = 0; end < fruits.length; end++) {
            fruitCounts.put(fruits[end], fruitCounts.getOrDefault(fruits[end], 0) + 1);

            while (fruitCounts.size() > 2) {
                fruitCounts.put(fruits[start], fruitCounts.get(fruits[start]) - 1);
                if (fruitCounts.get(fruits[start]) == 0) {
                    fruitCounts.remove(fruits[start]);
                }
                start++;
            }

            maxFruits = Math.max(maxFruits, end - start + 1);
        }

        return maxFruits;
    }
}