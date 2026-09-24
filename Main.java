import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DanhBa implements Comparable<DanhBa> {
    private String hoTen;
    private String soDienThoai;
    private String ngay;
    private String ten;
    private String hoDem;

    public DanhBa(String hoTen, String soDienThoai, String ngay) {
        this.hoTen = hoTen.trim();
        this.soDienThoai = soDienThoai.trim();
        this.ngay = ngay.trim();

        int idx = this.hoTen.lastIndexOf(' ');
        if (idx != -1) {
            this.ten = this.hoTen.substring(idx + 1);
            this.hoDem = this.hoTen.substring(0, idx);
        } else {
            this.ten = this.hoTen;
            this.hoDem = "";
        }
    }

    public int compareTo(DanhBa o) {
        if (!this.ten.equals(o.ten)) {
            return this.ten.compareTo(o.ten);
        }
        return this.hoDem.compareTo(o.hoDem);
    }

    public String toString() {
        return hoTen + ": " + soDienThoai + " " + ngay;
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SOTAY.txt"));
        PrintWriter pw = new PrintWriter(new File("DIENTHOAI.txt"));

        ArrayList<DanhBa> list = new ArrayList<>();
        String curDate = "";
        String curName = "";

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            if (line.startsWith("Ngay")) {
                curDate = line.substring(4).trim();
            } else if (curName.isEmpty()) {
                curName = line;
            } else {
                String phone = line;
                list.add(new DanhBa(curName, phone, curDate));
                curName = ""; 
            }
        }

        Collections.sort(list);

        for (DanhBa db : list) {
            pw.println(db);
        }

        sc.close();
        pw.close();
    }
}













