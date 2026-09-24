import java.util.*;

public class Cat_doi {
    public static boolean check1(String s){
        for(char c : s.toCharArray()){
            if(c != '0' && c != '1' && c != '8' && c != '9') return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        while(q-- > 0){
            String s = sc.nextLine();
            if(check1(s)){
                String res = "";
                for(char c : s.toCharArray()){
                    if(c == '1') res += '1';
                    else res += '0';
                }

                int idx = -1;

                for(int i = 0; i < res.length(); i++){
                    if(res.charAt(i) != '0'){
                        idx = i;
                        break;
                    }
                }

                if(idx != -1){
                    String result = res.substring(idx);
                    System.out.println(result);
                }

                else{
                    System.out.println("INVALID");
                }
            }

            else System.out.println("INVALID");
        }


        sc.close();
    }
}
