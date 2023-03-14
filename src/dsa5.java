import java.util.TreeMap;
public class dsa5 {
   /* static class node{
        char key;
        node left,right;
        node(char key){
            this.key = key;
        }
    }*/
    public static void main(String[] args) {
       // TreeMap<Object, Integer> t = new TreeMap<>();
        TreeMap<Object,Integer> t = new TreeMap<>();
        t.put("prashant",1);
        t.put("ankita",2);
        t.put("Sin",3);
        t.put("Jun",4);
        t.remove("Sin");
        System.out.println(t);
    }
}
