public class Vip extends Meja{
    int a;

    public Vip(int nikCust, String namaCust, String jmCust, String jamMulai, int noMeja) {
        super(nikCust, namaCust, jmCust, jamMulai, noMeja);
    }

    public int harga(int a){
        return a*1000;
    }
}