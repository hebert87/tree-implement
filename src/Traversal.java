



public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(15);
    root.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);
    //preOrder(root);
    int results = sum(root);
    System.out.println(results);
    System.err.println(oddSum(root));
  }
  public static void preOrder(TreeNode current){
    // null return ,print our data, search left, search right

    if(current == null) return;

    System.out.println(current.data);
    // search the left side
    preOrder(current.left);
    preOrder(current.right );
    
  }
  public static  int sum(TreeNode node){
    // if null -> 0
    if (node == null) return 0;
    // else my calue + sum of left subtree + sum right subtree
    // start total at root
    int total = node.data;

    // add sum of left subtree to total
    total+= sum(node.left);
    total+=sum(node.right);
    return total;

  }
  public static int oddSum(TreeNode node) {
      if (node == null) return 0;
      int total =0;

      if (node.data % 2 != 0) {
          total+= node.data;
      }
      total += oddSum(node.left);
      total += oddSum(node.right);
      return total;
  }
}
