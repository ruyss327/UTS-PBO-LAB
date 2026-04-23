package jawaban1;
public class Karyawan {
    private String id;
    private String nama;
    private String posisi;
    private double gaji;

    // Constructor
    public Karyawan(String id, String nama, String posisi, double gaji) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        setGaji(gaji);
    }

    // Getter dan Setter
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getPosisi() { return posisi; }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public double getGaji() { return gaji; }

    public void setGaji(double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji tidak boleh negatif!");
        }
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Posisi: " + posisi + ", Gaji: Rp" + gaji;
    }
}
