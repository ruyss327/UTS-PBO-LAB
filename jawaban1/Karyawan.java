public class Karyawan {
    private String nama;
    private String nip;
    private double gaji;
    
    // Constructor
    public Karyawan(String nama, String nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
    
    public String getNip() {
        return nip;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Method
    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji: Rp" + gaji);
    }
}