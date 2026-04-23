package jawaban1;
import java.util.ArrayList;

public class Perusahaan {
    private ArrayList<Karyawan> daftarKaryawan;

    public Perusahaan() {
        daftarKaryawan = new ArrayList<>();
    }

    public boolean tambahKaryawan(Karyawan k) {
        for (Karyawan existing : daftarKaryawan) {
            if (existing.getId().equals(k.getId())) {
                System.out.println("Error: ID sudah ada!");
                return false;
            }
        }
        daftarKaryawan.add(k);
        System.out.println("Karyawan berhasil ditambahkan.");
        return true;
    }

    public boolean hapusKaryawan(String id) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getId().equals(id)) {
                daftarKaryawan.remove(k);
                System.out.println("Karyawan berhasil dihapus.");
                return true;
            }
        }
        System.out.println("Karyawan dengan ID tersebut tidak ditemukan.");
        return false;
    }

    public boolean ubahPosisi(String id, String posisiBaru) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getId().equals(id)) {
                k.setPosisi(posisiBaru);
                System.out.println("Posisi berhasil diubah.");
                return true;
            }
        }
        System.out.println("Karyawan dengan ID tersebut tidak ditemukan.");
        return false;
    }

    public boolean ubahGaji(String id, double gajiBaru) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getId().equals(id)) {
                try {
                    k.setGaji(gajiBaru);
                    System.out.println("Gaji berhasil diubah.");
                    return true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
        }
        System.out.println("Karyawan dengan ID tersebut tidak ditemukan.");
        return false;
    }

    public void tampilkanSemua() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada karyawan.");
        } else {
            for (Karyawan k : daftarKaryawan) {
                System.out.println(k);
            }
        }
    }
}
