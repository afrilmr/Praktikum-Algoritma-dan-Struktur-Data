import java.util.Arrays;
import java.util.Scanner;

public class Barang01 {
    private String kode;
    private String nama;
    private int harga;
    private int stok;

    public Barang01 (String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }


    public void tampilkanBarang() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    public int setStok(int i) {
        return stok;
    }

}

class TransaksiBarang {
    private Barang01[] barangs;
    private Barang01[] pembelians;

    public TransaksiBarang(Barang01[] barangs) {
        this.barangs = barangs;
        this.pembelians = new Barang01[0];
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Barang Pembelian:");
        for (Barang01 barang : pembelians) {
            barang.tampilkanBarang();
            System.out.println();
        }
    }

    public void melakukanPembelian(String kode) {
        for (Barang01 barang : barangs) {
            if (barang.getKode().equals(kode)) {
                pembelians = Arrays.copyOf(pembelians, pembelians.length + 1);
                pembelians[pembelians.length - 1] = barang;
                barang.setStok(barang.getStok() - 1);
                System.out.println("Pembelian berhasil!");
                return;
            }
        }
        System.out.println("Kode barang tidak ditemukan!");
    }
}