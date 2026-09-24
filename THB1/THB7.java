import java.io.*;
import java.util.*;

class WordSet {
    TreeSet <String> set = new TreeSet<>();

    public WordSet(String s){
        String[] a = s.trim().toLowerCase().split("\\s+");
        for(String x : a){
            if(!x.isEmpty()){
                set.add(x);
            }
        }
    }

    public String union(WordSet b){
        TreeSet <String> res = new TreeSet<>(this.set);
        res.addAll(b.set);
        return String.join(" ", res);
    }

    public String intersection(WordSet b){
        TreeSet <String> res = new TreeSet<>(this.set);
        res.retainAll(b.set);
        return String.join(" ", res);
    }
}

public class THB7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
        
    }
}


// public static void main(String[] args) throws FileNotFoundException
// Scanner in = new Scanner(new File("VANBAN.in"));
// WordSet s1 = new WordSet(in.nextLine());
// WordSet s2 = new WordSet(in.nextLine());
// System.out.println(s1.union(s2));
// System.out.println(s1.intersection(s2));