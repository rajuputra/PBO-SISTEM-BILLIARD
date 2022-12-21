public class Meja {
    private int nikCust;
    private String namaCust;
    private String jmCust;
    private String jamMulai;
    private int noMeja;

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public int harga(int a){
        return a;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }

    public Meja(int nikCust, String namaCust, String jmCust, String jamMulai, int noMeja) {
        this.nikCust = nikCust;
        this.namaCust = namaCust;
        this.jmCust = jmCust;
        this.jamMulai = jamMulai;
        this.noMeja = noMeja;
    }

    public int getNikCust() {
        return nikCust;
    }

    public void setNikCust(int nikCust) {
        this.nikCust = nikCust;
    }

    public String getNamaCust() {
        return namaCust;
    }

    public void setNamaCust(String namaCust) {
        this.namaCust = namaCust;
    }

    public String getJmCust() {
        return jmCust;
    }

    public void setJmCust(String jmCust) {
        this.jmCust = jmCust;
    }
}