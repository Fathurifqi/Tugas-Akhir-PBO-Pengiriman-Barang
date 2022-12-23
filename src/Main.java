package driver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import object.Barang;
import object.Satu;
import object.Tarif;
public class Main extends Satu {
    public Main(int angka) {
        super(angka);
    }
    static Scanner ssc1 = new Scanner(System.in);
    static BufferedReader ssc2 = new BufferedReader(new InputStreamReader(System.in));
    static Tarif trf = new Tarif(0,0,0,0);
    static Barang brg;
    static Random nores = new Random();
    static ArrayList<Barang> data = new ArrayList<Barang>();
    public static void main(String[] args) throws IOException {
        do {
            menu();
        } while (true);
    }
    private static void menu() throws IOException {
        System.out.println("===============================================");
        System.out.println("           WELCOME TO           ");
        System.out.println("      UAD EXPRESS SHIPPING      ");
        System.out.println("===============================================");
        System.out.println("Pilih Menu :");
        System.out.println(" 1. Cek Tarif Paket \n 2. Input Data Paket \n 3. Data Paket \n 4. Exit \n 5. Start Menu");
        System.out.println("===============================================");
        System.out.print("Pilih : ");
        int pilih = ssc1.nextInt();
        System.out.println("===============================================");
        switch (pilih) {
            case 1:
                System.out.println();
                System.out.println("===============================================");
                System.out.println("Cek Tarif Paket");
                System.out.println("===============================================");
                System.out.print("Berat Barang (Kg)\t= ");
                int berat = ssc1.nextInt();
                System.out.print("Panjang Barang (Cm)\t= ");
                int panjang = ssc1.nextInt();
                System.out.print("Lebar Barang (Cm)\t= ");
                int lebar = ssc1.nextInt();
                System.out.print("Tinggi Barang (Cm)\t= ");
                int tinggi = ssc1.nextInt();
                trf = new Tarif(berat, panjang, lebar, tinggi);
                trf.rumus();
                System.out.println("===============================================");
                System.out.println("Total Harga = Rp. "+trf.tarif);
                System.out.println("===============================================");
                System.out.println();
                berat = 0;
                panjang = 0;
                lebar = 0;
                tinggi = 0;
                break;
            case 2:
                System.out.println();
                System.out.println("===============================================");
                System.out.println("Kirim Paket");
                System.out.println("===============================================");
                System.out.print("Nama Pengirim\t\t= ");
                String namPengirim = ssc2.readLine();
                System.out.print("Alamat Pengirim\t\t= ");
                String alaPengirim = ssc2.readLine();
                System.out.print("Nama Penerima\t\t= ");
                String namPenerima = ssc2.readLine();
                System.out.print("Alamat Penerima\t\t= ");
                String alaPenerima = ssc2.readLine();
                System.out.print("Berat Paket(Kg)\t\t= ");
                berat = ssc1.nextInt();
                System.out.print("Panjang Paket (Cm)\t\t= ");
                panjang = ssc1.nextInt();
                System.out.print("Lebar Paket (Cm)\t\t= ");
                lebar = ssc1.nextInt();
                System.out.print("Tinggi Paket (Cm)\t\t= ");
                tinggi = ssc1.nextInt();
                int resi = nores.nextInt(999999999) + 111111111;
                data.add(brg = new Barang(namPengirim, alaPengirim, namPenerima, alaPenerima, resi, berat, panjang, lebar, tinggi));
                brg.rumus();
                System.out.println("===============================================");
                System.out.println("Harga yang harus dibayar = Rp. "+brg.tarif);
                System.out.println("Data Telah Tersimpan ...");
                System.out.println("===============================================");
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("===============================================");
                System.out.println("Data Paket");
                System.out.println("===============================================");
                int i = 0;
                for (Barang o:data) {
                    System.out.println("Data Ke - "+(i+1));
                    System.out.println("Nama Pengirim\t= " + o.getNama_pengirim());
                    System.out.println("Alamat Pengirim\t= " + o.getAlamat_pengirim());
                    System.out.println("Nama Penerima\t= " + o.getNama_penerima());
                    System.out.println("Alamat Penerima\t= " + o.getAlamat_penerima());
                    System.out.println("No Resi\t\t\t= " + o.getNomor_resi());
                    System.out.println("Status\t\t\t= " + o.getStatus());
                    System.out.println("Harga\t\t\t= Rp. " + brg.tarif);
                    System.out.println("===============================================");
                    i++;
                }
                System.out.println();
                break;
            case 4:
                System.out.println("Exit ...");
                System.exit(0);
                break;
            case 5:
                System.out.println();
                break;
            default:
                System.out.println("Error, Tolong coba masukkan data dengan benar ...");
                break;
        }
    }
}