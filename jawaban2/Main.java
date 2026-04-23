package jawaban2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        String lanjut;

        do {
            System.out.println("\n--- PARKIRCHAN PARKING SYSTEM ---");
            System.out.print("Masukkan jenis kendaraan (motor/mobil/truk): ");
            String jenis = sc.nextLine();

            Kendaraan k = new Kendaraan(jenis);

            System.out.println("Pilih cara input durasi:");
            System.out.println("1. Input langsung jumlah jam");
            System.out.println("2. Input jam masuk dan jam keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan durasi parkir (jam): ");
                int durasi = sc.nextInt();
                sc.nextLine();
                k.hitungBiaya(durasi);
            } else {
                System.out.print("Masukkan jam masuk (0-23): ");
                int masuk = sc.nextInt();
                System.out.print("Masukkan jam keluar (0-23): ");
                int keluar = sc.nextInt();
                sc.nextLine();
                k.hitungBiaya(masuk, keluar);
            }

            k.tampilkanRingkasan();
            daftarKendaraan.add(k);

            System.out.print("Tambah kendaraan lain? (y/n): ");
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n=== RINGKASAN AKHIR ===");
        int totalKendaraan = daftarKendaraan.size();
        double totalBiaya = 0;

        for (Kendaraan k : daftarKendaraan) {
            totalBiaya += k.getBiaya();
        }

        System.out.println("Total kendaraan: " + totalKendaraan);
        System.out.println("Total semua biaya parkir: Rp" + totalBiaya);

        sc.close();
    }
}
