
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Pegawai {
    private final String username  = "bl";
    private final String password = "123";

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    Customer pelanggan = new Customer();
    Scanner in = new Scanner(System.in);
    Vip x = new Vip(000,"Billiard","Meja","00.00",0);
    Biasa y = new Biasa(000, "Billiard","Meja", "00.00",0);

    int pilih,nomor,menit;
    String jenisMeja, jamMulai;
    List<Vip> daftarVip = new ArrayList<>();
    List<Biasa> daftarBiasa = new ArrayList<>();

    public void dataVip(){
        int a = 0;
        while (a!=4){
            System.out.println("==========================");
            System.out.println("||    MENU KELOLA VIP    ||");
            System.out.println("==========================");
            System.out.println("Menu Kelola List Vip");
            System.out.println("1. Lihat List Vip");
            System.out.println("2. Tambahkan Pesanan");
            System.out.println("3. Cetak Struk Pesanan Selesai");
            System.out.println("4. Keluar");
            a = in.nextInt();
            if (a == 1){
                tampilkanDaftarVip(daftarVip);
            }
            else if(a == 2){
                if(daftarVip.size()<5){
                    System.out.println("Masukkan Nik : ");
                    pelanggan.nik = in.nextInt();
                    System.out.println("Masukkan Nama : ");
                    pelanggan.nama = in.next();
                    System.out.println("Jenis Meja : ");
                    pelanggan.jenis_meja = in.next();
                    System.out.println("Jam Mulai : ");
                    pelanggan.jamMulai = in.next();
                    System.out.println("No Meja : ");
                    pelanggan.noMeja = in.nextInt();
                    daftarVip.add(new Vip(pelanggan.nik, pelanggan.nama, pelanggan.jenis_meja, pelanggan.jamMulai,pelanggan.noMeja));
                }
                else {
                    System.out.println("Meja Vip Sudah Full");
                }

            }
            else if(a == 3){
                System.out.println("Masukkan nomor index pesanan yang selesai : ");
                nomor = in.nextInt();
                daftarVip.remove(nomor);
                System.out.println("Masukkan jam mulai : ");
                jamMulai = in.next();
                System.out.println("Masukkan jumlah menit : ");
                menit = in.nextInt();
                System.out.println("Total bayar : " + x.harga(menit));
                try {
                    FileWriter tulisan = new FileWriter("src\\struk.txt");
                    BufferedWriter tulis = new BufferedWriter(tulisan);
                    tulis.write("=========================================\n");
                    tulis.write("STRUK\n");
                    tulis.write("Jam mulai : "+jamMulai+"\n");
                    tulis.write("Jumlah Menit : "+menit+"\n");
                    tulis.write("Total Bayar : "+x.harga(menit)+"\n");
                    tulis.write("=========================================\n");
                    tulis.close();
                    System.out.println("Struk Berhasi Di Cetak");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan");
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("    ");
            }
        }
    }
    public void dataBiasa(){
        int b = 0;
        while (b!= 4){
            System.out.println("==========================");
            System.out.println("||   MENU KELOLA BIASA  ||");
            System.out.println("==========================");
            System.out.println("1. Lihat List Biasa");
            System.out.println("2. Tambahkan Pesanan");
            System.out.println("3. Cetak Struk");
            System.out.println("4. Keluar");
            b = in.nextInt();
            if (b == 1){
                tampilkanDaftarBiasa(daftarBiasa);
            } else if(b == 2){
                if (daftarBiasa.size()<10){
                    System.out.println("Masukkan Nik : ");
                    pelanggan.nik = in.nextInt();
                    System.out.println("Masukkan Nama : ");
                    pelanggan.nama = in.next();
                    System.out.println("Jenis Meja : ");
                    pelanggan.jenis_meja = in.next();
                    System.out.println("Jam Mulai : ");
                    pelanggan.jamMulai = in.next();
                    System.out.println("No Meja : ");
                    pelanggan.noMeja = in.nextInt();
                    daftarBiasa.add(new Biasa(pelanggan.nik, pelanggan.nama, pelanggan.jenis_meja, pelanggan.jamMulai,pelanggan.noMeja));
                }
                else {
                    System.out.println("Meja Biasa Full!!!");
                }
            }
            else if(b==3){
                System.out.println("Masukkan nomor index pesanan yang selesai : ");
                nomor = in.nextInt();
                daftarVip.remove(nomor);
                System.out.println("Masukkan jam mulai : ");
                jamMulai = in.next();
                System.out.println("Masukkan jumlah menit : ");
                menit = in.nextInt();
                System.out.println("Total bayar : " + y.harga(menit));
                try {
                    FileWriter tulisan = new FileWriter("src\\struk.txt");
                    BufferedWriter tulis = new BufferedWriter(tulisan);
                    tulis.write("=========================================\n");
                    tulis.write("STRUK\n");
                    tulis.write("Jam mulai : "+jamMulai+"\n");
                    tulis.write("Jumlah Menit : "+menit+"\n");
                    tulis.write("Total Bayar : "+y.harga(menit)+"\n");
                    tulis.write("=========================================\n");
                    tulis.close();
                    System.out.println("Struk Berhasi Di Cetak");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan");
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("    ");
            }
        }
    }
    public static void tampilkanDaftarVip(List<Vip> daftarVip) {
        System.out.println("Daftar Vip:");
        for (int i = 0; i < daftarVip.size(); i++) {
            Vip vip = daftarVip.get(i);
            System.out.println("- Index: " + i );
            System.out.println(" ID: " + vip.getNikCust());
            System.out.println(" Nama: " + vip.getNamaCust());
            System.out.println(" Jenis Meja: " + vip.getJmCust());
            System.out.println(" Jam Mulai: "+ vip.getJamMulai());
            System.out.println(" No Meja : "+vip.getNoMeja());
            System.out.println("    ");
        }
    }
    public static void tampilkanDaftarBiasa(List<Biasa> daftarBiasa) {
        System.out.println("Daftar Biasa:");
        for (int i = 0; i < daftarBiasa.size(); i++) {
            Biasa biasa = daftarBiasa.get(i);
            System.out.println("- Index: " + i );
            System.out.println(" ID: " + biasa.getNikCust());
            System.out.println(" Nama: " + biasa.getNamaCust());
            System.out.println(" Jenis Meja: " + biasa.getJmCust());
            System.out.println(" Jam Mulai: "+ biasa.getJamMulai());
            System.out.println(" No Meja : "+biasa.getNoMeja());
        }
    }

}
