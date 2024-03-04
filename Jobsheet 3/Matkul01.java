public class Matkul01 {
    public String nama;
    public int sks;
    public int jam;
    public String dosenPengampu;

    // Konstruktor
    public Matkul01(String nama, int sks, int jam, String dosenPengampu) {
        this.nama = nama;
        this.sks = sks;
        this.jam = jam;
        this.dosenPengampu = dosenPengampu;
    }

    // Metode cetakInfo
    public void cetakInfo() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jam per SKS: " + jam);
        System.out.println("Nama Dosen Pengampu: " + dosenPengampu);
    }
}
