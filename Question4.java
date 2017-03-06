public class Question4 {
    public List<Integer> largestValues(TreeNode root) {
        /* queue for a BFS, traversing in level-order, as we want to visit every node on a level before going to a lower level*/
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        /* to store the results */
        List<Integer> res = new ArrayList<Integer>();
        
        queue.add(root);
        
        int queueSize;
        if (root == null) queueSize = 0;
        else queueSize = 1;
        
        // starts off with 1 for head
        // until queuesize is 0
        while (queueSize > 0) {
            // restarts to integer.min_value, as the for loop starts for each depth-level
            int largestElement = Integer.MIN_VALUE;
            
            for (int i = 0; i < queueSize; i++) {
                // retreive and remove the head of the queue
                TreeNode cur = queue.poll();
                
                largestElement = Math.max(cur.val, largestElement);
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            
            res.add(largestElement);
            queueSize = queue.size();
        }
        return res;
    }
}