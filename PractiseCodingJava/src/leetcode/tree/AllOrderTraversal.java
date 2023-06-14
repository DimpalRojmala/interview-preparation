package leetcode.tree;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
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

public class AllOrderTraversal {


    public static void main(String[] args) {
        TreeNode tree= new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right=new TreeNode(3);
        tree.left.left=new TreeNode(5);
        tree.left.right=new TreeNode(6);
        System.out.println("preorderTraversal(new TreeNode()) = " + preorderTraversal(tree));
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        helper(root,ans,"post");
        return ans;


    }
    public static void helper(TreeNode tree,List<Integer> ans,String order)
    {
        if(tree==null)
        {
            return;
        }

        if(order.equalsIgnoreCase("pre")) {
            ans.add(tree.val);
            helper(tree.left, ans, order);
            helper(tree.right, ans, order);
        } else if (order.equalsIgnoreCase("post")) {
            helper(tree.left,ans,order);
            //ans.add(tree.val );
            helper(tree.right,ans,order);
            ans.add(tree.val);

        } else if (order.equalsIgnoreCase("in")) {
            helper(tree.left,ans,order);
            ans.add(tree.val);
            helper(tree.right,ans,order);
        }


    }
}

