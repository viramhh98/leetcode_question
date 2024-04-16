class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);

    }

    public boolean check(TreeNode left, TreeNode right) {
        if(left==null && right ==null ){
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (right.val != left.val) {
            return false;
        }
        // System.out.println(left.val);
        // System.out.println(right.val);
        
        return (check(left.left, right.right)  && check(left.right, right.left));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.left.left = new TreeNode();
        t.left.right = new TreeNode(3);
        t.right = new TreeNode(2);
        t.right.right = new TreeNode(3);
        t.right.left = new TreeNode();
        System.out.println(s.isSymmetric(t));
    }
}

// javac Solution.java
// java Solution.java