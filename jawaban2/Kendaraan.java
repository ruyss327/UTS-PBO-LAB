package jawaban2;
public class Kendaraan {
    private String jenis;
    private int durasi; // dalam jam

    // Constructor
    public Kendaraan(String jenis) {
        this.jenis = jenis;
    }

    // Overloading method hitungBiaya dengan input manual durasi
    public double hitungBiaya(int durasi) {
        this.durasi = durasi;
        return hitungBiaya();
    }

    // Overloading method hitungBiaya dengan jam masuk dan keluar
    public double hitungBiaya(int jamMasuk, int jamKeluar) {
        this.durasi = jamKeluar - jamMasuk;
        if (this.durasi < 0) this.durasi += 24; // lewat tengah malam
        return hitungBiaya();
    }

    // Method private untuk menghitung biaya
    private double hitungBiaya() {
        int tarifPerJam;
        switch (jenis.toLowerCase()) {
            case "motor": tarifPerJam = 2000; break;
            case "mobil": tarifPerJam = 5000; break;
            case "truk": tarifPerJam = 10000; break;
            default: tarifPerJam = 0;
        }

        double total = durasi * tarifPerJam;

        if (durasi > 5) {
            total *= 0.9; // diskon 10%
        }

        return total;
    }

    public void tampilkanRingkasan() {
        double biaya = hitungBiaya();
        System.out.println("Jenis: " + jenis + ", Durasi: " + durasi + " jam, Total: Rp" + biaya);
    }

    public double getBiaya() {
        return hitungBiaya();
    }
}
