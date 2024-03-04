import java.util.Scanner;

public class MatkulMain01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya jumlah Mata Kuliah yang ingin Anda inputkan: ");
        int jumlahMatkul = sc01.nextInt();
        sc01.nextLine();
        System.out.println();

        Matkul01[] arrayOfMatkul01 = new Matkul01[jumlahMatkul];
        int sks, jam;
        String nama, dosenPengampu;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.print("Masukkan Nama Mata Kuliah: ");
            nama = sc01.nextLine();
            System.out.print("Masukkan SKS: ");
            sks = sc01.nextInt();
            System.out.print("Masukkan jam per SKS: ");
            jam = sc01.nextInt();
            sc01.nextLine();
            System.out.print("Masukkan Nama Dosen Pengampu: ");
            dosenPengampu = sc01.nextLine();

            arrayOfMatkul01[i] = new Matkul01(nama, sks, jam, dosenPengampu);
            System.out.println();
        }
        
        System.out.println();
        System.out.println("======================");
        System.out.println("Informasi Mata Kuliah");
        System.out.println("======================");
        for (Matkul01 matkul : arrayOfMatkul01) {
            matkul.cetakInfo();
            System.out.println("---------------------------------------");
        }
    }
}
