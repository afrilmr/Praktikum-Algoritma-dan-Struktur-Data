public class Buku01 {

    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, hargaBayar;
    double diskon;

void tampilInformasi() {
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("jumlah halaman: " + halaman);
        System.out.println("sisa stok: " + stok);
        System.out.println("harga: Rp " + harga);
        System.out.println("Total Harga: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga Bayar: Rp " + hargaBayar);
    }

void terjual(int jml) {
    if (stok > 0) {
        stok -= jml; 
    } else {
        System.out.println("Stok tidak mencukupi!");
    }  
}

void restock(int jml){
    stok += jml;
}

void gantiHarga(int hrg){
    harga = hrg;   
}

public int hitungHargaTotal(){
    return harga * stok;
}

public double hitungDiskon() {
    double diskon = 0;
    int hargaTotal = hitungHargaTotal();
    if (hargaTotal > 150000) {
        diskon = hargaTotal * 0.12;
    } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
        diskon = hargaTotal * 0.05;
    }
    return diskon;
}

public double hitungHargaBayar(){
    return hitungHargaTotal() - hitungDiskon();
}

Buku01() {

}

Buku01 (String jud, String pg, int hal, int stok, int har, int hartot, double disc, int harbar){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
    hargaTotal = hartot;
    diskon = disc;
    hargaBayar = harbar;
}
}