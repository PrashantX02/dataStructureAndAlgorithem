class Node{
    char key;
    Node left, right;
    Node(char key){
        this.key= key;
    }
    static class treeTraversaal{
        Node root;
        void preorderTraversal(Node j){
            if(j!=null){
                System.out.print(j.key+" ");
                preorderTraversal(j.left);
                preorderTraversal(j.right);
            }
        }
    }
}
public class dsa8 {
    public static void main(String[] args) {
        Node.treeTraversaal newTree = new Node.treeTraversaal();
        newTree.root = new Node('A');
        newTree.root.left = new Node('B');
        newTree.root.left.left = new Node('C');
        newTree.root.left.right= new Node('D');
        newTree.root.right = new Node('E');
        newTree.root.right.right = new Node('F');
        newTree.preorderTraversal(newTree.root);
    }
}
