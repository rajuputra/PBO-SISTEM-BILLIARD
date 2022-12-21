import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Makan extends Konsum{
    Scanner in = new Scanner(System.in);
    int pil;
    String namaMakan;
    public void pesan(){
        menu();
        pil = in.nextInt();
        System.out.println("Masukan nik : ");
        nik = in.nextInt();
        System.out.println("Masukkan nama : ");
        nama = in.next();
        if (pil == 1){
            namaMakan = "Kentang Goreng";
            cetakStruk(namaMakan);
        }
        else if(pil == 2){
            namaMakan = "Burger";
            cetakStruk(namaMakan);
        }
        else if (pil == 3){
            namaMakan = "Nasi Goreng";
            cetakStruk(namaMakan);
        }
        else{
            System.out.println("Berhasil Kembali");
        }

    }
    public void menu(){
        System.out.println("==========================");
        System.out.println("||    MENU PESAN MAKAN  ||");
        System.out.println("==========================");
        System.out.println("Menu Minuman Kami : ");
        System.out.println("1. Kentang Goreng ");
        System.out.println("2. Burger");
        System.out.println("3. Nasi Goreng");
        System.out.println("4. Untuk Kembali");
    }
    public void cetakStruk(String x){
        try{
            FileWriter tulisan = new FileWriter("src\\konsumlist.txt");
            BufferedWriter tulis = new BufferedWriter(tulisan);
            tulis.write("=====================================\n");
            tulis.write("STRUK PEMESANAN , BAWA KE KASIR\n");
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
