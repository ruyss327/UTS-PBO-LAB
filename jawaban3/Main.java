public class Main {
    public static void main(String[] args) {
        System.out.println("=== Program Lotre Board ===\n");
        
        // Membuat object LotreBoard
        LotreBoard lotre = new LotreBoard(6);
        
        // Menampilkan nomor lotre
        lotre.tampilNomor();
        
        // Cek nomor tertentu
        System.out.println("\nPencarian Nomor:");
        int nomorCek = lotre.getNomor()[0];
        System.out.println("Nomor " + nomorCek + " ada: " + lotre.cekNomor(nomorCek));
        System.out.println("Nomor 999 ada: " + lotre.cekNomor(999));
        
        // Menampilkan total
        System.out.println("\nTotal Nomor: " + lotre.hitungTotal());
    }
}