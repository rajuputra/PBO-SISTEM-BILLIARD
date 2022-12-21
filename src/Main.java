import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h = 0;
        int g = 0;
        int f = 0;
        int j = 0;
        int x = 0;
        Scanner in = new Scanner(System.in);
        Pegawai pgw = new Pegawai();
        Customer cust = new Customer();
        int masuk,pil = 0;
        String user = "hm", pass = "hm";


        while (g != 3){
            System.out.println("==========================");
            System.out.println("||    SLEBEW BILLIARD   ||");
            System.out.println("==========================");
            System.out.println("Masuk Sebagai : ");
            System.out.println("1. Pelanggan");
            System.out.println("2. Pegawai");
            System.out.println("3. Tutup");
            System.out.println("==========================");
            g = in.nextInt();
            if (g == 1){
                f = 0;
                while (f != 3){
                    System.out.print("\033[H\033[2J");
                    System.out.println("==========================");
                    System.out.println("||    MENU PELANGGAN    ||");
                    System.out.println("==========================");
                    System.out.println("Selamat Datang Pelanggan ");
                    System.out.println("Silahkan Pilih : ");
                    System.out.println("1. Pesan Meja ");
                    System.out.println("2. Pesan Konsumsi");
                    System.out.println("3. Kembali");
                    f = in.nextInt();
                    if (f == 1){
                        cust.pesanMeja();
                    }
                    else if (f == 2) {
                        cust.pesanKonsum();
                    }
                    else if (f == 3){
                        System.out.println("Anda Berhasil Kembali");
                    }
                    else {
                        System.out.println("Pilihan Tidak Ada");
                    }
                }
            }
            else if (g == 2){
                user = "salah" ;
                pass = "salah" ;
                while (!(user.equals(pgw.getUsername()) && pass.equals(pgw.getPassword()))){
                    System.out.println("Masukkan Username : ");
                    user = in.next();
                    System.out.println("Masukkan Password : ");
                    pass = in.next();
                    if (user.equals(pgw.getUsername()) && pass.equals(pgw.getPassword())){
                        System.out.print("\033[H\033[2J");
                        pil = 0;
                        while (pil != 3){
                            System.out.println("==========================");
                            System.out.println("||      MENU PEGAWAI    ||");
                            System.out.println("==========================");
                            System.out.println("Silahkan Pilih : ");
                            System.out.println("1. Kelola Data Meja Vip");
                            System.out.println("2. Kelola Data Meja Biasa");
                            System.out.println("3. Keluar");
                            pil = in.nextInt();
                            if (pil == 1){
                                pgw.dataVip();
                            }
                            else if (pil == 2){
                                pgw.dataBiasa();
                            }
                            else {
                                System.out.println("Anda Keluar dari Menu Pegawai");
                            }
                        }
                    }
                    else {
                        System.out.println("Password Salah Silahkan Ulang!");
                    }
                }
            }
            else if (g == 3){
                System.out.println("Anda Keluar");
            }
            else {
                System.out.println("Pilihan Tidak Ada");
            }
        }
    }
}
