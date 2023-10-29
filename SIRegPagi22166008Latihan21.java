package pkgLatihan21;
import java.util.Scanner;
/**
* author
* Nama      :A`isatul Iza
* Nim       :22166008
* Deskripsi : Program ini adalah program yang menampilkan perhitungan nilai rata-rata  yang inputannya dari user
*/
public class SIRegPagi22166008Latihan21 {
  public static void main(String[] args) {
    // variabel
    int jumlahnilai = 0;
    int banyakmahasiswa;
    double ratarata;
    Scanner scanner = new Scanner(System.in);
    // Input banyak siswa
    System.out.print("Masukkan banyaknya Mahasiswa : ");
    banyakmahasiswa = scanner.nextInt();
    // Input nilai dan hitung jumlah nilai
    for (int i = 1; i <= banyakmahasiswa; i++) {
        System.out.print("Nilai Mahasiswa ke-" + i + ": ");
        int nilai = scanner.nextInt();
        jumlahnilai += nilai;
    }
    // menghitung nilai  rata-rata
    ratarata = (double) jumlahnilai / banyakmahasiswa;
    // Output rata-rata
    System.out.println("Maka, Rata-rata nilainya adalah " + ratarata);
    // Developed by
    System.out.println("Developed by : A'isatul Iza");
  }
}
