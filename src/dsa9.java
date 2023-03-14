class NODE{
    char key;
    NODE left,right;

    NODE(char key){
        this.key = key;
    }
    static class BinarySolution{
        NODE root;
        NODE insertInTree(NODE root,char key){
            if(root==null){
                root = new NODE(key);
                return  root;
            }
            if(key<root.key){
                root.left = insertInTree(root.left,key);
            }else if(key>root.key){
                root.right = insertInTree(root.right , key);
            }
            return root;
        }
         void insertInKey(char key){
            root = insertInTree(root,key);
        }
        void preorderTraversall(NODE root){
            if(root!=null){
                System.out.println(root.key+" ");
                preorderTraversall(root.left);
                preorderTraversall(root.right);
            }
        }
    }
}
public class dsa9 {
    public static void main(String[] args) {
        NODE.BinarySolution b = new NODE.BinarySolution();
        b.insertInKey('A');
        b.insertInKey('B');
        b.insertInKey('C');
        b.insertInKey('D');
        b.insertInKey('E');
        b.insertInKey('F');
        b.insertInKey('J');
        b.preorderTraversall(b.root);
    }
}
