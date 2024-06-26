import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static class TreeNode {
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

  public static List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          int size = queue.size();
          for(int i =0; i<size; i++){
              TreeNode node = queue.poll();
              if(i==size-1) res.add(node.val);
              if(node.left!=null) queue.add(node.left);
              if(node.right!=null) queue.add(node.right);
          }
      }
      return res;

  }
}
