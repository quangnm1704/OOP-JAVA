import java.util.*;

public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n);
    }
}

// package danhsachsinhvien1;

// import java.io.*;
// import java.text.SimpleDateFormat;
// import java.util.*;

// class SinhVien implements Serializable {
//     private String id;
//     private String name;
//     private String lop;
//     private Date dob;
//     private float gpa;

//     // Chuẩn hóa họ tên
//     public String getChuanHoaName() {
//         String[] words = this.name.trim().toLowerCase().split("\\s+");
//         StringBuilder sb = new StringBuilder();
//         for (String w : words) {
//             if (!w.isEmpty()) {
//                 sb.append(Character.toUpperCase(w.charAt(0)))
//                   .append(w.substring(1))
//                   .append(" ");
//             }
//         }
//         return sb.toString().trim();
//     }

//     @Override
//     public String toString() {
//         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//         return id + " " + getChuanHoaName() + " " + lop + " " + sdf.format(dob) + " " + String.format("%.2f", gpa);
//     }
// }

// public class Main {
//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) throws Exception {
//         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
//         ArrayList<SinhVien> list = (ArrayList<SinhVien>) ois.readObject();
//         ois.close();

//         for (SinhVien sv : list) {
//             System.out.println(sv);
//         }
//     }
// }