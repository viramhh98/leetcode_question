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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return check(root, 0, 0);
    }
   
    public int check(TreeNode root,int maxdepth, int depth){
        if(root==null){
            if(depth>maxdepth){
                maxdepth=depth;
            }
            return maxdepth;   
        }
        maxdepth=check(root.left, maxdepth,depth+1);
        maxdepth=check(root.right, maxdepth,depth+1);
        return maxdepth;
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
        System.out.println(s.maxDepth(t));
    }
}



