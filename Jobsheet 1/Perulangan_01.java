import java.util.Scanner;

public class Perulangan_01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.println("========================");
        System.out.print("Masukkan NIM: ");
        long nim = sc01.nextLong();
        System.out.println("========================");
        // Mengecek 2 digit terakhir dari inputan NIM
        long duaDigitTerakhir = nim % 100;
        System.out.println("n: " + duaDigitTerakhir);
        long n = duaDigitTerakhir;
        // Mengecek apakah 2 digit terakhir <10 atau tidak, jika 'ya' akan ditambah 10
        if (n < 10) {
            System.out.println("Karena n lebih kecil dari 10 maka " + n + " + 10 = " + (n+10));
            n += 10;
        }

        System.out.println("\nDeretan bilangan: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // Memastikan angka ganjil saat dicetak tidak berupa angka melainkan simbol '*'
                System.out.print(" *");
            // Untuk memastikan bahwa angka 6 dan 10 diabaikan saat mencetak deretan bilangan
            } else if (i != 6 && i != 10) {
                System.out.print(" " + i);
            }
            if (i < n && (i + 1) % 2 == 0 && (i + 1) != 10) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("========================");
    }
}
