import java.util.*;
import java.io.*;

class WordSet{
    private TreeSet <String> set;

    public WordSet(String s){
        set = new TreeSet<>();
        String[] words = s.trim().toLowerCase().split("\\s+");
        for(String w : words){
            if(!w.isEmpty()){
                set.add(w);
            }
        }
    }

    public String union(WordSet o){
        TreeSet <String> res = new TreeSet<>(this.set);
        res.addAll(o.set);
        return String.join(" ", res);
    }

    public String intersection(WordSet o){
        TreeSet<String> res = new TreeSet<>(this.set);
        res.retainAll(o.set);
        return String.join(" ", res);
    }
}

public class KTB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());

        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));

    }
}
