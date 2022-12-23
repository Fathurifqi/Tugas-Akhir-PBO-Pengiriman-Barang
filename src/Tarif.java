package object;
public class Tarif extends object.Induk {
    public Tarif(int berat, int panjang, int lebar, int tinggi) {
        super(berat, panjang, lebar, tinggi);
    }
    public void rumus(){
        tarif = (super.berat_barang * 50) + (super.panjang_barang * super.lebar_barang * super.tinggi_barang * 10);
    }
}