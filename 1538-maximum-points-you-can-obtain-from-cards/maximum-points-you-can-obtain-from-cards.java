class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxS = Integer.MIN_VALUE;
        int currentPoint =0;
        // total current point from start 
        for(int i=0; i<k; i++){
            currentPoint = currentPoint+cardPoints[i];
        }
         maxS = currentPoint;
        // now Slide the window by taking cards from the back instead of the front
        for(int i=0; i<k; i++){
            currentPoint = currentPoint -cardPoints[k-1-i]+ cardPoints[cardPoints.length -1-i];
             if(currentPoint>maxS){
            maxS = currentPoint;
        }
        }
        return maxS;
        
    }
}