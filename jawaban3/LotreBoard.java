public class LotreBoard {
    private int[] nomor;
    private int jumlahNomor;
    
    // Constructor
    public LotreBoard(int jumlahNomor) {
        this.jumlahNomor = jumlahNomor;
        this.nomor = new int[jumlahNomor];
        generateNomor();
    }
    
    // Method untuk generate nomor random
    private void generateNomor() {
        for (int i = 0; i < jumlahNomor; i++) {
            nomor[i] = (int)(Math.random() * 100) + 1;
        }
    }
    
    // Method untuk mendapatkan nomor
    public int[] getNomor() {
        return nomor;
    }
    
    // Method untuk menampilkan nomor
    public void tampilNomor() {
        System.out.print("Nomor Lotre: ");
        for (int i = 0; i < jumlahNomor; i++) {
            System.out.print(nomor[i]);
            if (i < jumlahNomor - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    // Method untuk cek apakah nomor ada
    public boolean cekNomor(int n) {
        for (int i = 0; i < jumlahNomor; i++) {
            if (nomor[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    // Method untuk menghitung jumlah nomor
    public int hitungTotal() {
        int total = 0;
        for (int i = 0; i < jumlahNomor; i++) {
            total += nomor[i];
        }
        return total;
    }
}