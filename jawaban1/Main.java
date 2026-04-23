public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("Maju Jaya");
        Karyawan karyawan1 = new Karyawan("Budi Santoso", "001", 5000000);
        Karyawan karyawan2 = new Karyawan("Siti Nurhaliza", "002", 5500000);
        Karyawan karyawan3 = new Karyawan("Ahmad Wijaya", "003", 4800000);
        perusahaan.tambahKaryawan(karyawan1);
        perusahaan.tambahKaryawan(karyawan2);
        perusahaan.tambahKaryawan(karyawan3);
        perusahaan.tampilSemuaKaryawan();
    }
}