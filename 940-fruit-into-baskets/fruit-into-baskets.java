class Solution {
    public int totalFruit(int[] fruits) {
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currentMax = 0;
        int maxFruits = 0;

        for (int fruit : fruits) {
            // Extend the current window if the fruit is the same as one of the last two
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currentMax++;
            } else {
                // Start a new window by counting from the last fruit's occurrence
                currentMax = lastFruitCount + 1;
            }

            // Update last fruit count or reset it
            if (fruit == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
            }

            // Update the fruits being tracked
            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            // Update the max fruits collected
            maxFruits = Math.max(maxFruits, currentMax);
        }

        return maxFruits;
    }
    }