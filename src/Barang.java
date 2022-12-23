package object;
public class Barang {
    public String nama_pengirim, alamat_pengirim, nama_penerima, alamat_penerima,
            status;
    public int nomor_resi, berat_barang, panjang_barang, lebar_barang, tinggi_barang;
    public double tarif;
    public Barang(String nPengirim, String alaPengirim, String nPenerima, String alaPenerima,
                  int resi, int berat, int panjang, int lebar, int tinggi){
        nama_pengirim = nPengirim;
        alamat_pengirim = alaPengirim;
        nama_penerima = nPenerima;
        alamat_penerima = alaPenerima;
        berat_barang = berat;
        panjang_barang = panjang;
        lebar_barang = lebar;
        tinggi_barang = tinggi;
        nomor_resi = resi;
    }
    public String getNama_pengirim() {
        return nama_pengirim;
    }
    public String getAlamat_pengirim() {
        return alamat_pengirim;
    }
    public String getNama_penerima() {
        return nama_penerima;
    }
    public String getAlamat_penerima() {
        return alamat_penerima;
    }
    public String getStatus() {
        status = "Dikirim";
        return status;
    }
    public int getNomor_resi() {
        return nomor_resi;
    }
    public void rumus(){
        tarif = (berat_barang * 8) + (panjang_barang * lebar_barang * tinggi_barang * 1);
    }
}