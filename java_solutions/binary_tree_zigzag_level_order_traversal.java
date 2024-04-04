import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
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

  public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> zigzag = new ArrayList<>();
        if(root==null) return zigzag;

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);

      boolean flag = false;

      while(!queue.isEmpty()){
          int qsize = queue.size();
          List<Integer> level = new ArrayList<>();
          Stack<Integer> stack = new Stack<>();

          for (int i =0; i<qsize; i++) {
              TreeNode node = queue.poll();
              //check if flag is true - add to stack, false- add to level ddirectly
              if (flag) stack.add(node.val);
              else level.add(node.val);

              if (node.left != null) queue.add(node.left);
              if (node.right != null) queue.add(node.right);
          }
          flag = !flag;
          // pop all elems from stack
          while(!stack.isEmpty()){
              level.add(stack.pop());
          }

          zigzag.add(level);
      }
      return zigzag;

  }
}
