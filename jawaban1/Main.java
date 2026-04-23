package jawaban1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perusahaan perusahaan = new Perusahaan();
        int pilihan;

        do {
            System.out.println("\n== SISTEM MANAJEMEN KARYAWAN ==");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi");
            System.out.println("4. Ubah Gaji");
            System.out.println("5. Tampilkan Semua Karyawan");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Posisi: ");
                    String posisi = sc.nextLine();
                    System.out.print("Masukkan Gaji: ");
                    double gaji = sc.nextDouble();
                    sc.nextLine();

                    Karyawan k = new Karyawan(id, nama, posisi, gaji);
                    perusahaan.tambahKaryawan(k);
                    break;

                case 2:
                    System.out.print("Masukkan ID karyawan yang akan dihapus: ");
                    String idHapus = sc.nextLine();
                    perusahaan.hapusKaryawan(idHapus);
                    break;

                case 3:
                    System.out.print("Masukkan ID karyawan: ");
                    String idUbahPosisi = sc.nextLine();
                    System.out.print("Masukkan posisi baru: ");
                    String posisiBaru = sc.nextLine();
                    perusahaan.ubahPosisi(idUbahPosisi, posisiBaru);
                    break;

                case 4:
                    System.out.print("Masukkan ID karyawan: ");
                    String idUbahGaji = sc.nextLine();
                    System.out.print("Masukkan gaji baru: ");
                    double gajiBaru = sc.nextDouble();
                    sc.nextLine();
                    perusahaan.ubahGaji(idUbahGaji, gajiBaru);
                    break;

                case 5:
                    perusahaan.tampilkanSemua();
                    break;

                case 6:
                    System.out.println("Keluar dari sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 6);

        sc.close();
    }
}
