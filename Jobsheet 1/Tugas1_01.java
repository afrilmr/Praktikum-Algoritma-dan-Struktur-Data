import java.util.Scanner;

public class Tugas1_01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        // Menyimpan informasi plat mobil dan asal kotanya dalam array
        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String kota[][] = {
            {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"}
        };

        System.out.print("Masukkan kode plat mobil: ");
        char inputKode = sc01.next().charAt(0);

        // Untuk mencari kesesuaian pasangan antara kode plat mobil dengan asal kotanya 
        boolean kodeDitemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                kodeDitemukan = true;
                System.out.println("Kota yang berpasangan dengan plat mobil " + inputKode + " adalah " + kota[0][i]);
                break;
            }
        }
        if (!kodeDitemukan) {
            System.out.println("Kode plat mobil tidak valid");
        }
    }
}
