class box{
    box right, left;
    char key;
    box(char key){
        this.key = key;
    }
    static class tree{
        box root;
        public void preorder(box t){
            //RootLR
            if(t!=null){
                System.out.print(t.key+" ");
                preorder(t.left);
                preorder(t.right);
            }
        }
        public void postorder(box t){
            //LRRoot
            if(t!=null){
                preorder(t.left);
                preorder(t.right);
                System.out.print(t.key+" ");
            }
        }
        void inorder(box t){
            if(t!=null){
                inorder(t.left);
                System.out.print(t.key+" ");
                inorder(t.right);
            }
        }
    }
}
public class rough4 {
    public static void main(String[] args) {
        box.tree t1 = new box.tree();
        t1.root = new box('A');
        t1.root.left = new box('B');
        t1.root.right = new box('C');
        t1.root.left.left = new box('D');
        t1.root.left.right = new box('E');
        t1.root.right.right = new box('F');
        t1.root.right.left = new box('G');
        System.out.println("This is the preorder tree data structure.");
        t1.preorder(t1.root);
        System.out.println("");
        System.out.println("This is the postorder Tree data structure.");
        t1.postorder(t1.root);
        System.out.println("");
        System.out.println("This is the inorder Tree data structure.");
        t1.inorder(t1.root);

    }
}
