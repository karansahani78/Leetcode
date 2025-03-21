import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1) {
            if (seen.contains(n)) {
                return false; // Cycle detected
            }
            seen.add(n);
            
            // Compute sum of squares of digits inline
            int sum = 0, temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            
            n = sum; // Update n with the new value
        }
        return true;
    }
}
