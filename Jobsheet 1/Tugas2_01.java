import java.util.Scanner;

public class Tugas2_01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        boolean ulangi = true;

        System.out.println("===============================");
        // Pemilihan menu 
        while (ulangi) {
            System.out.println("Menu untuk Menghitung Rumus: ");
            System.out.println("a. Kecepatan ");
            System.out.println("b. Jarak ");
            System.out.println("c. Waktu ");

            System.out.print("\nPilih menu (a/b/c): ");
            char pilihMenu = sc01.next().toLowerCase().charAt(0);

            System.out.println("===============================");

            switch (pilihMenu) {
                case 'a':
                    System.out.print("Masukkan jarak (km): ");
                    double jarakK = sc01.nextDouble();
                    System.out.print("Masukkan waktu (jam): ");
                    double waktuK = sc01.nextDouble();
                    double kecepatan = hitungKecepatan(jarakK, waktuK);
                    System.out.println("\nKecepatan = " + kecepatan + " km/jam");
                    break;

                case 'b':
                    System.out.print("Masukkan kecepatan (km/jam): ");
                    double kecepatanJ = sc01.nextDouble();
                    System.out.print("Masukkan waktu (jam): ");
                    double waktuJ = sc01.nextDouble();
                    double jarak = hitungJarak(kecepatanJ, waktuJ);
                    System.out.println("\nJarak = " + jarak + " km");
                    break;

                case 'c':
                    System.out.print("Masukkan jarak (km): ");
                    double jarakW = sc01.nextDouble();
                    System.out.print("Masukkan kecepatan (km/jam): ");
                    double kecepatanW = sc01.nextDouble();
                    double waktu = hitungWaktu(jarakW, kecepatanW);
                    System.out.println("\nWaktu = " + waktu + " jam");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Harap memilih menu yang sesuai.");
            }
            System.out.println("===============================");
            //Pemilihan program akan berjalan kembali atau tidak
            System.out.print("Apakah Anda ingin menghitung lagi? (y/t): ");
            char pilihan = sc01.next().toLowerCase().charAt(0);

            ulangi = (pilihan == 'y');
        }

        System.out.println("Program Selesai");
    }
    // Fungsi untuk memanggil dari fungsi main yaitu kecepatan
    public static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu; // rumus perhitungan
    }
    // Fungsi untuk memanggil kembali dari fungsi main yaitu jarak
    public static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu; // rumus perhitungan
    }
    // Fungsi untuk memanggil dari fungsi main yaitu waktu
    public static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan; // rumus perhitungan
    }
}
