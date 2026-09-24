import java.util.*;

class pair{
    public int first;
    public int second;

    public pair(int first, int second){
        this.first = first;
        this.second = second;
    }

}

public class xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pair[] a = new pair[n];

        for(int i = 0; i < n; i++){
            a[i] = new pair(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(a, new Comparator <pair>(){
            public int compare(pair a, pair b){
                if(a.first == b.first){
                    if(a.second < b.second) return -1;
                    else return 1;
                }

                else{
                    if(a.first < b.first) return -1;
                    else return 1;
                }
            }
        });

        int curr = a[0].first + a[0].second;

        for(int i = 1; i < n; i++){
            if(a[i].first > curr){
                curr = a[i].first;
            }
            curr += a[i].second;
        }

        System.out.println(curr);

    }
}
