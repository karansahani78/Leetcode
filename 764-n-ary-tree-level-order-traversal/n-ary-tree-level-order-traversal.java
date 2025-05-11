/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int currentLevelSize = q.size();
            List<Integer>currentLevel = new ArrayList<>();
            for(int i=0; i<currentLevelSize; i++ ){ 
            Node currentNode = q.poll();
            currentLevel.add(currentNode.val);
            for(Node child: currentNode.children){
                if(child!=null){
                    q.offer(child);

                }
            }
        }
         result.add(currentLevel);
            }
            return result;
        
    }
}