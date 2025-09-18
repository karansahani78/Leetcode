class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prevE = -1;

        for (int i = 0; i < arr.length; i++) {
            try {
                int currentE = Integer.parseInt(arr[i]); // try parsing
                if (prevE >= currentE) return false;     // check ascending
                prevE = currentE;
            } catch (NumberFormatException e) {
                // ignore non-numeric words
            }
        }
        return true;
    }
}
