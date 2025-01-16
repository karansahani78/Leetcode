class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // making hashset to store unique element
        HashSet<Integer>unique = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            unique.add(nums1[i]);
        }
        // now creating a arraylist to store common element
        ArrayList<Integer>result = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if(unique.contains(nums2[i])){
                result.add(nums2[i]);
                unique.remove(nums2[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}