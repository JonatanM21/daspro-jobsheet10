// p= 17
// jumlah nilai mahasiswa : 5 + (P mod 11) = 11
// salah satu nilai yang di input : P mod 100 = 17 
import java.util.Scanner;

public class NilaiMahasiswa17 {
    public static void main(String[] args) {
         Scanner Jonatan = new Scanner(System.in); 

        System.out.print("Masukkan Banyak Mahasiswa :");
        int BanyakMhs= Jonatan.nextInt();

        int[] nilaiMhs = new int[BanyakMhs];
        int total =0 ; double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = Jonatan.nextInt();
            total += nilaiMhs[i]; 
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0],terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
          if (rata2 >= 85) {
            System.out.println("Predikat kelas :" +  "Sangat Baik");
        }if (rata2 >= 70 ) {
            System.out.println("Predikat kelas :" + "Baik");
        } else {
            System.out.println("Perlu Pendampingan");
        }
    }
}
