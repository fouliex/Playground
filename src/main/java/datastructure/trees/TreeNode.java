package datastructure.trees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode find(Integer data) {
        if (this.data == data && !isDeleted())
            return this;
        if (data < this.data && leftChild != null) {
            return leftChild.find(data);
        }
        if (rightChild != null) {
            return rightChild.find(data);
        }
        return null;

    }

    public void insert(Integer data) {
        if (data >= this.data) {
            // rightChild
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        } else {
            // leftChild
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }

        }
    }


    public Integer smallest(){
        if(this.leftChild == null){
            return this.data;
        }
        return this.leftChild.smallest();
    }

    public Integer biggest(){
        if(this.rightChild == null){
            return this.data;
        }
        return this.rightChild.biggest();
    }
    public void delete(){
           isDeleted = true;
    }

    public boolean isDeleted(){
        return  isDeleted;
    }



    public int getData() {
        return data;

    }

    public void traverseInOrder() {
        if(this.leftChild !=null) {
            this.leftChild.traverseInOrder();
        }
        System.out.print(data + " ");
        if(this.rightChild != null){
            this.rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(data + " ");
        if(this.leftChild != null){
            this.leftChild.traversePreOrder();
        }
       if(this.rightChild != null){
           this.rightChild.traversePreOrder();
        }

    }

    public void traversePostOrder() {
        if(this.leftChild != null) {
            this.leftChild.traversePostOrder();
        }
        if(this.rightChild != null){
            this.rightChild.traversePostOrder();
        }
        System.out.print(data + " ");

    }
}
