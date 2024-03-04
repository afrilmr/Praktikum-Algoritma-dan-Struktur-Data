public class BukuMain01 {

    String judul, pengarang;
    int halaman, stok, harga;
    double hargaTotal, diskon, hargaBayar;


void tampilInformasi (){
    System.out.println("judul: " + judul);
    System.out.println("pengarang: " + pengarang);
    System.out.println("jumlah halaman: " + halaman);
    System.out.println("sisa stok: " + stok);
    System.out.println("harga: Rp " + harga);
    System.out.println("Total Harga: " + hargaTotal);
    System.out.println("Diskon: " + diskon);
    System.out.println("Harga Bayar: " + hargaBayar);
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

public int hitungDiskon(){
    int diskon = 0;
    int hargaTotal = hitungHargaTotal();
    if (hargaTotal > 150000){
        diskon = (int) (hargaTotal * 0.12);
    } else if (hargaTotal >= 75000 && hargaTotal <= 150000){
        diskon = (int) (hargaTotal * 0.05); 
    } 
    return diskon;
}

public int hitungHargaBayar(){
    return hitungHargaTotal() - hitungDiskon();
}

public static void main(String[] args) {
    BukuMain01 bk1 = new BukuMain01();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga= 71000;

    System.out.println();
    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.hitungHargaTotal();
    bk1.hitungDiskon();
    bk1.hitungHargaBayar();
    System.out.println();
    bk1.tampilInformasi();

    System.out.println();
    Buku01 bk2 = new Buku01("self reward","maheera ayesha", 160, 29, 59000, 0, 0, 0 );
    bk2.terjual(11);
    bk1.hitungHargaTotal();
    bk1.hitungDiskon();
    bk1.hitungHargaBayar();
    bk2.tampilInformasi();

    System.out.println();
    Buku01 bkafril = new Buku01("Kehidupan", "Toni Sutisno", 65, 35, 65000, 0, 0, 0);
    bkafril.terjual(12);
    bk1.hitungHargaTotal();
    bk1.hitungDiskon();
    bk1.hitungHargaBayar();
    bkafril.tampilInformasi();
}
}