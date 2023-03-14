import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

public class dsa1 {
    public static void main(String[] args) throws IOException {
        TreeMap<String ,String> s = new TreeMap<String,String>(Collections.reverseOrder());

        s.put("1","hello");
        s.put("2","hello");
        s.put("3","hello");
        s.put("4","hello");
        System.out.println(s);

        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(3);
        n.add(2);
        n.add(1);

        System.out.println((long) n.size());// return the total number of element in arraylist
        System.out.println(n.stream().sorted().collect(Collectors.toList()));// sorting a arrayList
        System.out.println(n.stream().map(x->x*x).collect(Collectors.toList()));//square of the element in the list

        ArrayList<String> name= new ArrayList<>();
        name.add("prashant");
        name.add("poonam");
        name.add("swapan");
        name.add("jayent");
        System.out.println(name.stream().map(x->x.startsWith("p")).collect(Collectors.toList()));
        //
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,6,5,1);
        System.out.println(arr.stream().distinct().collect(Collectors.toList()));// return a array with unique element only
        arr.stream().map(ss->ss*ss).forEach(y->System.out.println(y));
        System.out.println(arr.stream().map(z->z+5).collect(Collectors.toList()));
        //
        File f = new File("prashant.txt");
        Scanner sc = new Scanner(f);
        try{
            FileWriter w = new FileWriter(f);
            w.write("prince bhadwa\n");
            w.write("prince ladwa\n");
            w.write("prince ki pantis me gulabi choot");
            w.close();

            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(IOException ignored){
            System.out.println("file is not created.");
        }
        List<Integer> ss = Arrays.asList(11,22,43,84,75);
        System.out.println((ss));

        System.out.println((int) ss.size());
        System.out.println(ss.stream().map(x->x*x).collect(Collectors.toList()));

        System.out.println(ss.stream().map(x->x*(-2)).collect(Collectors.toList()));
        System.out.println(ss.stream().sorted().collect(Collectors.toList()));

        ss.forEach(x-> System.out.println(x));
        System.out.println("prashant");

        String nam = "prashant";
        ArrayList<Integer> in = new ArrayList<>();
        int i=0;
        while(i<=nam.length()){
            System.out.println("Prashant is account");
            i++;
        }
    }
}