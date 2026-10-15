import java.util.*;
import java.io.*;

public class TH3_B13 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
        ArrayList <String> list = (ArrayList<String>) ois.readObject();
        ois.close();

        TreeSet <Integer> set = new TreeSet<>();
        for(String s : list){
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                try{
                    set.add(Integer.parseInt(st.nextToken()));
                }
                catch(Exception ignored){}
            }
        }

        for(int x : set){
            System.out.println(x);
        }
    }
}
