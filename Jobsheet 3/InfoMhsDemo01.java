import java.util.Scanner;

public class InfoMhsDemo01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        InfoMahasiswa01[] arrayOfInfoMhs01 = new InfoMahasiswa01[3];

        double total,rataRata;

        for (int i = 0; i < 3; i++) {
            arrayOfInfoMhs01[i] = new InfoMahasiswa01();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama: ");
            arrayOfInfoMhs01[i].nama = sc01.nextLine();
            System.out.print("Masukkan NIM: ");
            arrayOfInfoMhs01[i].nim = sc01.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            arrayOfInfoMhs01[i].jenisKelamin = sc01.next();
            System.out.print("Masukkan Jumlah IPK: ");
            arrayOfInfoMhs01[i].ipk = sc01.nextDouble();

            sc01.nextLine();
            System.out.println();

        }
        System.out.println();

        System.out.println("======================");
        System.out.println("Informasi Mahasiswa");
        System.out.println("======================");

            for (int i = 0; i < 3; i++) {
                System.out.println("Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + arrayOfInfoMhs01[i].nama);
                System.out.println("Nim: " + arrayOfInfoMhs01[i].nim);
                System.out.println("Jenis kelamin: " + arrayOfInfoMhs01[i].jenisKelamin);
                System.out.println("Ipk: " + arrayOfInfoMhs01[i].ipk);
    
                System.out.println();
            }
            total = 0;
        for (InfoMahasiswa01 infoMhs : arrayOfInfoMhs01) {
            total += infoMhs.ipk;
        }
            rataRata = total / arrayOfInfoMhs01.length;

            System.out.println("-----------------------");
            System.out.println("Rata-rata IPK Mahasiswa: " + rataRata);
        }
    }