class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.data = val;
        this.right = null;
        this.left = null;
    }
}

public class Main {
    public static TreeNode createbtree(int[] arr, int i, int n) {
        if (i >= n) {
            return null;
        }
        TreeNode root = new TreeNode(arr[i]);
        root.left = createbtree(arr, 2 * i + 1, n);
        root.right = createbtree(arr, 2 * i + 2, n);
        return root;
    }
    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode btree = createbtree(arr, 0, arr.length);
        System.out.print("Preorder traversal: ");
        preorder(btree);
    }
}
