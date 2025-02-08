class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxS =Integer.MIN_VALUE;
        int currentPoint = 0;
        for(int i=0; i<k; i++){
            currentPoint = currentPoint +cardPoints[i];
        }
        maxS = currentPoint;
        // remove elements from k i.e(k-1) remove from currentPoints and from last element(cardPoints.length-1) and add it to sum
        for(int i=0; i<k; i++){
            currentPoint = currentPoint -cardPoints[k-1-i]+cardPoints[cardPoints.length-1-i];
            if(currentPoint>maxS){
                maxS = currentPoint;
            }
        }
        return maxS;
   
    }
}