import java.util.ArrayList;

public class Perusahaan {
    private String nama;
    private ArrayList<Karyawan> daftarKaryawan;
    
    // Constructor
    public Perusahaan(String nama) {
        this.nama = nama;
        this.daftarKaryawan = new ArrayList<>();
    }
    
    // Method untuk menambah karyawan
    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }
    
    // Method untuk menampilkan semua karyawan
    public void tampilSemuaKaryawan() {
        System.out.println("=== Karyawan PT " + nama + " ===");
        for (Karyawan k : daftarKaryawan) {
            k.tampilData();
            System.out.println("---");
        }
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
}