public class SymmetricTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    class Solution {
        public boolean dfs(TreeNode leftchild, TreeNode rightchild){
            if (leftchild == null && rightchild == null)
                return true;
            if (leftchild == null || rightchild == null)
                return false;
            if(leftchild.val != rightchild.val)
                return false;
            return (dfs(leftchild.left, rightchild.right) &&
                    dfs(leftchild.right, rightchild.left));
        }

        public boolean isSymmetric(TreeNode root) {
            return dfs(root.left, root.right);

        }
    }

  
}
