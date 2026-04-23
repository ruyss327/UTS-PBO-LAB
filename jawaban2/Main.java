public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Toyota", "Avanza", 2022, 200000000);
        Kendaraan kendaraan2 = new Kendaraan("Honda", "Jazz", 2023, 250000000);
        
        System.out.println("=== Data Kendaraan ===\n");
        
        System.out.println("--- Kendaraan 1 ---");
        kendaraan1.tampilData();
        kendaraan1.nyalakan();
        kendaraan1.matikan();
        
        System.out.println("\n--- Kendaraan 2 ---");
        kendaraan2.tampilData();
        kendaraan2.nyalakan();
        kendaraan2.matikan();
    }
}