import java.util.Scanner;
import java.io.FileWriter;   // Mengimport Class FileWriter
import java.io.IOException;  // Mengimport Class IOException untuk menangani error
import java.io.BufferedWriter;
public class Customer {
    public int nik;
    public String nama;
    public String jenis_meja;
    public String jamMulai;
    public int noMeja;
    int v;

    Minum minum = new Minum();
    Makan makan = new Makan();
    int pilih,pilihMeja;
    Scanner in = new Scanner(System.in);

    public void pesanMeja(){
        System.out.println("Masukkan nik : ");
        nik = in.nextInt();
        System.out.println("Masukkan Nama : ");
        nama = in.next();
        System.out.println("Jenis meja :" );
        System.out.println("1. Biasa ");
        System.out.println("2. Vip");
        pilihMeja = in.nextInt();
        if (pilihMeja == 1){
            jenis_meja = "biasa";
        }
        else {
            jenis_meja = "vip";
        }
        try {
            FileWriter tulisan = new FileWriter("src\\waitinglist.txt", true);
            BufferedWriter tulis = new BufferedWriter(tulisan);
            tulis.write(nik+"\n");
            tulis.write(nama+"\n");
            tulis.write(jenis_meja+"\n");
            tulis.append("\n");
            tulis.close();
            System.out.println("Pesanan Sudah Masuk ! Silahkan Tunggu Waiting List Anda");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan");
            e.printStackTrace();
        }
    }
    public void pesanKonsum(){
        v = 0;
        while (v != 10){
            System.out.println("Pilihan Konsum : ");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Desert");
            System.out.println("4. Untuk Keluar");

            pilih = in.nextInt();
            if (pilih == 1){
                makan.pesan();
            }
            else if (pilih == 2){
                minum.pesan();
            }
            else if(pilih == 3){
                System.out.println("Pilihan belum tersedia");
            }
            else {
                v = 10;
                System.out.println("Back");
            }
        }

    }


    }
