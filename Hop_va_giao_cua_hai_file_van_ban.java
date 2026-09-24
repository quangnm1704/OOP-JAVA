import java.io.*;
import java.util.*;

class WordSet{
    TreeSet <String> set;
    public WordSet(String filename) throws IOException{
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }

    public String union(WordSet o){
        TreeSet <String> res = new TreeSet<>(this.set);
        res.addAll(o.set);
        return String.join(" ", res);
    }

    public String intersection(WordSet o) {
        TreeSet<String> res = new TreeSet<>(this.set);
        res.retainAll(o.set);
        return String.join(" ", res);
    }
}

public class Hop_va_giao_cua_hai_file_van_ban {
    public static void main(String[] args) throws IOException {
            WordSet s1 = new WordSet("DATA1.in");
            WordSet s2 = new WordSet("DATA2.in");
            System.out.println(s1.union(s2));
            System.out.println(s1.intersection(s2));
        }
}
