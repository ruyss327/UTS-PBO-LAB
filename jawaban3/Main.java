package jawaban3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LotreBoard board = new LotreBoard();

        System.out.println("=== SELAMAT DATANG DI LOTRE GOSOK ===");
        System.out.println("Tebak posisi baris dan kolom (1-4 baris, 1-5 kolom)");
        System.out.println("* = belum digosok, O = aman, X = bom\n");

        while (!board.isGameOver()) {
            board.displayBoard();

            System.out.print("Masukkan baris: ");
            int row = sc.nextInt() - 1;

            System.out.print("Masukkan kolom: ");
            int col = sc.nextInt() - 1;

            if (row < 0 || row >= 4 || col < 0 || col >= 5) {
                System.out.println("Input tidak valid. Masukkan baris 1-4 dan kolom 1-5.");
                continue;
            }

            board.guess(row, col);
        }

        System.out.println("\n=== Papan Akhir ===");
        board.displayBoard();

        if (board.isBombExploded()) {
            System.out.println("Anda kalah karena terkena bom!");
        } else {
            System.out.println("Selamat! Anda menang!");
        }

        sc.close();
    }
}
