import java.util.Scanner;

public class MainBarang01{
   public static void main(String[] args) {
       
       Barang01[] barangs = {
           new Barang01("BRG01", "Sabun", 6000, 5),
           new Barang01("BRG02", "Pasta Gigi", 12000, 10),
           new Barang01("BRG03", "Shampoo", 7000, 10),
           new Barang01("BRG04", "Sabun Muka", 15000, 15),
           new Barang01("BRG05", "Sikat Gigi", 7000, 10),
       };
       
       TransaksiBarang transaksiBarang = new TransaksiBarang(barangs);

       Scanner scanner = new Scanner(System.in);
       int pilihan;

       do {
           System.out.println("Menu:");
           System.out.println("1. Tampilkan Barang");
           System.out.println("2. Daftar Barang Pembelian");
           System.out.println("3. Tampilkan Pembelian");
           System.out.println("4. Keluar");
           System.out.print("Masukkan pilihan: ");
           pilihan = scanner.nextInt();
       

           switch (pilihan){
               case 1:
                   for (Barang01 barang : barangs){
                       barang.tampilkanBarang();
                       System.out.println();
                   }
                   break;
               case 2:
                   transaksiBarang.tampilkanBarangPembelian();
                   break;
               case 3:
                   System.out.print("Masukkan kode barang: ");
                   String kodeBarang = scanner.next();
                   transaksiBarang.melakukanPembelian(kodeBarang);
                   break;
               case 4:
                   break;
               default:
                   System.out.println("Pilihan tidak valid");
           }
       }while (pilihan != 4);
   }
}