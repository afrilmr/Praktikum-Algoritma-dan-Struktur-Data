import java.util.Scanner;

public class Pemilihan_01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        // Input Komponen Nilai
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = sc01.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int nilaiKuis = sc01.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS = sc01.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS = sc01.nextInt();

        System.out.println("==============================");
        // Output "tidak valid" jika nilai yang diinput tidak sesuai ketentuan
        if (nilaiTugas >= 0 && nilaiTugas <= 100 &&
            nilaiKuis >= 0 && nilaiKuis <= 100 &&
            nilaiUTS >= 0 && nilaiUTS <= 100 &&
            nilaiUAS >= 0 && nilaiUAS <= 100){
                //Perhitungan Nilai Akhir
                double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                // Konversi nilai angka menjadi nilai huruf
                if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                    System.out.println("Konversi Nilai: A");
                } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                    System.out.println("Konversi Nilai: B+");
                } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                    System.out.println("Koversi Nilai: B");
                } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                    System.out.println("Konversi Nilai: C+");
                } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                    System.out.println("Konversi Nilai: C");
                } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                    System.out.println("Konversi Nilai: D");
                } else if (nilaiAkhir <= 39) {
                    System.out.println("Koversi Nilai: E");
                }

                System.out.println();
                System.out.println("==============================");
                //Pernyataan lulus/tidak lulus
                if (nilaiAkhir > 50) {
                    System.out.println("SELAMAT ANDA LULUS");
                } else {
                    System.out.println("MOHON MAAF, ANDA TIDAK LULUS");
                }
            } else {
                System.out.println("Nilai Tidak Valid. Mohon Masukkan Kembali Nilai Antara (0-100)");
            }
            System.out.println("==============================");
    }
}