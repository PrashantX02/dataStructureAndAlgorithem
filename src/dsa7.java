class Node2 {
    char key;
    Node2 left, right;

    Node2(char key) {
        this.key = key;

    }

    static class TreeTraversal {
        Node2 root;

        void preorderTraversal(Node2 n) {
            if (n != null) {
                System.out.print(n.key + " ");
                preorderTraversal(n.left);
                preorderTraversal(n.right);
            }
        }
        void postorderTraversal(Node2 n) {
            if (n != null) {
                postorderTraversal(n.left);
                postorderTraversal(n.right);
                System.out.print(n.key + " ");
            }
        }
        public void inorderTraversal(Node2 n){
            if(n!=null){
                inorderTraversal(n.left);
                System.out.print(n.key+" ");
                inorderTraversal(n.right);
            }
        }
    }
}public class dsa7 {
    public static void main(String[] args) {
        Node2.TreeTraversal t1 = new Node2.TreeTraversal();
        t1.root = new Node2('A');
        t1.root.left = new Node2('B');
        t1.root.right = new Node2('C');
        t1.root.left.left = new Node2('D');
        t1.root.left.right = new Node2('E');
        t1.preorderTraversal(t1.root);
        System.out.println("");
        t1.postorderTraversal(t1.root);
        System.out.println("");
        t1.inorderTraversal(t1.root);
    }
}
