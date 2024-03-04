import java.util.Scanner;
public class PersegiPanjangDemo01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        // Modif agar panjang array dapat ditentukan oleh user
        System.out.print("Masukkan banyaknya jumlah Persegi Panjang yang Anda inginkan: ");
        int length = sc01.nextInt();

        PersegiPanjang01[] arrayOfPersegiPanjang01 = new PersegiPanjang01[length];
        int panjang, lebar;
        // Looping untuk menerima inputan
        for(int i = 0; i < length; i++) {
            arrayOfPersegiPanjang01[i] = new PersegiPanjang01();

            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan nilai panjang: ");
            panjang = sc01.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            lebar = sc01.nextInt();

            arrayOfPersegiPanjang01[i] = new PersegiPanjang01(panjang, lebar);
        }
        System.out.println("---------------");
        // Looping untuk menampilkan hasil ke layar
        for(int j = 0; j < length; j++) {
           arrayOfPersegiPanjang01[j].cetakInfo();
           System.out.println("---------------");
        }
    }
}