public class Barang {
    private String kode;
    private int stok;
    private int nextNum;
    private String nama;
    private long harga;

    private Barang(String nama,int stok,long harga){

    }

    public long getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public String getKode() {
        return kode;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
