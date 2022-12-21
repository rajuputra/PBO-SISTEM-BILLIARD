import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Minum extends Konsum{
    Scanner in = new Scanner(System.in);
    int pil;
    String namaMinum;
    public void pesan(){
        menu();
        pil = in.nextInt();
        System.out.println("Masukan nik : ");
        nik = in.nextInt();
        System.out.println("Masukkan nama : ");
        nama = in.next();
        if (pil == 1){
            namaMinum = "Es Teh";
            cetakStruk(namaMinum);
        }
        else if(pil == 2){
            namaMinum = "Teh Hangat";
            cetakStruk(namaMinum);
        }
        else if (pil == 3){
            namaMinum = "Es Boba";
            cetakStruk(namaMinum);
        }
        else{
            System.out.println("Berhasil Kembali");
        }

    }
    public void menu(){
        System.out.println("==========================");
        System.out.println("||    MENU PESAN MINUM  ||");
        System.out.println("==========================");
        System.out.println("Menu Minuman Kami : ");
        System.out.println("1. Es Teh ");
        System.out.println("2. Teh Hangat");
        System.out.println("3. Es Boba");
        System.out.println("4. Untuk Kembali");
    }
    public void cetakStruk(String x){
        try{
            FileWriter tulisan = new FileWriter("src\\konsumlist.txt");
            BufferedWriter tulis = new BufferedWriter(tulisan);
            tulis.write("=====================================");
            tulis.write("STRUK PEMESANAN , BAWA KE KASIR");
            tulis.write("Nik : " + nik +"\n");
            tulis.write("Nama : "+nama+"\n");
            tulis.write("Pesanan : "+x+"\n");
            tulis.write("=====================================");
            tulis.append("\n");
            tulis.close();
            System.out.println("STRUK PESANAN SUDAH TERCETAK, SILAHKAN BAWA KE KASIR");
        }catch (IOException e) {
            System.out.println("Terjadi kesalahan");
            e.printStackTrace();
        }
    }
}
