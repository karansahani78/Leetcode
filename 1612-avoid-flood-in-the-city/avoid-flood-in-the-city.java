import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> fullLakes = new HashMap<>(); // lake -> last rain day
        TreeSet<Integer> dryDays = new TreeSet<>(); // store indexes of 0 (dry days)

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1; // default, can change later
            } else {
                ans[i] = -1; // raining day
                int lake = rains[i];

                if (fullLakes.containsKey(lake)) {
                    // need a dry day after last rain before today
                    Integer dryDay = dryDays.higher(fullLakes.get(lake)); // next available dry day
                    if (dryDay == null) return new int[0]; // no dry day -> flood

                    ans[dryDay] = lake; // dry this lake
                    dryDays.remove(dryDay);
                }

                fullLakes.put(lake, i); // mark this lake as full
            }
        }

        return ans;
    }
}
