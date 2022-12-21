import java.util.Arrays;
public class Biasa extends Meja{
    int a;
    public int harga(int a){
        return a*500;
    }

    public Biasa(int nikCust, String namaCust, String jmCust, String jamMulai, int noMeja) {
        super(nikCust, namaCust, jmCust, jamMulai, noMeja);
    }
}
