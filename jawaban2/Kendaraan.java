public class Kendaraan {
    protected String merek;
    protected String model;
    protected int tahun;
    protected double harga;
    
    // Constructor
    public Kendaraan(String merek, String model, int tahun, double harga) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }
    
    // Getter
    public String getMerek() {
        return merek;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public double getHarga() {
        return harga;
    }
    
    // Method
    public void tampilData() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: Rp" + harga);
    }
    
    public void nyalakan() {
        System.out.println("Kendaraan dinyalakan...");
    }
    
    public void matikan() {
        System.out.println("Kendaraan dimatikan...");
    }
}