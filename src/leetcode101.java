

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class leetcode101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root == null) return true;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode t1 = queue.poll();
                TreeNode t2 = queue.poll();
                if(t1==null && t2==null) continue;
                if(t1==null || t2==null) return false;
                if(t1.val != t2.val) return false;
                queue.add(t1.left);
                queue.add(t2.right);
                queue.add(t1.right);
                queue.add(t2.left);
            }
            return true;
        }
    }
}
