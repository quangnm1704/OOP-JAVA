import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class user{
    public String username, password;

    public user(String name, String password){
        this.username = name;
        this.password = password;
    }
}

public class THB10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList <user> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new user(sc.next(), sc.next()));
        }


        int[] ans = new int[n];
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            String u = sc.next();
            String p = sc.next();

            for(int j = 0; j < n; j++){
                if(list.get(j).username.equals(u) && list.get(j).password.equals(p)){
                    ans[j]++;
                    break;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }
}
