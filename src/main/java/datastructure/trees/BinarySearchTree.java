package datastructure.trees;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else root.insert(data);
    }

    public TreeNode find(Integer data) {
        if (root != null) {
            return root.find(data);
        }
        return null;
    }

    // This is a soft delete
    public void delete(Integer data){
        TreeNode toDel = find(data);
        toDel.delete();

    }

public Integer smallest(){
        if(root != null){
            return root.smallest();
        }
        return null;
}

public Integer biggest(){
        if(root != null){
            return root.biggest();
        }
        return null;
}

  public void inOrderTraversal(){
        if (root != null){
            root.traverseInOrder();
        }
  }

  public void preOrderTraversal(){
        if(this.root != null){
            this.root.traversePreOrder();
        }
  }

    private void postOrderTraversal() {
        if(this.root!= null){
            root.traversePostOrder();
        }

    }

    public static void main(String[] args) {
        int[] sample = {212,580,6,7,28,84,112,434};
        BinarySearchTree bst = new BinarySearchTree();
        for (int x : sample){
            bst.insert(x);
        }
        System.out.println(bst.find(65));
        System.out.println(bst.smallest());
        System.out.println(bst.biggest());
        bst.inOrderTraversal();
        System.out.println();
        bst.preOrderTraversal();
        System.out.println();
        bst.postOrderTraversal();

    }


}