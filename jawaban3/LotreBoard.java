package jawaban3;
import java.util.Random;

public class LotreBoard {
    private char[][] board;
    private boolean[][] revealed;
    private int[][] data;
    private int safeCount;
    private static final int ROWS = 4;
    private static final int COLS = 5;
    private static final int BOM_COUNT = 2;
    private boolean gameOver;
    private boolean bombExploded;

    public LotreBoard() {
        board = new char[ROWS][COLS];
        revealed = new boolean[ROWS][COLS];
        data = new int[ROWS][COLS];
        safeCount = 0;
        gameOver = false;
        bombExploded = false;
        generateBoard();
        initBoardDisplay();
    }

    public void generateBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                data[i][j] = 0;
            }
        }

        Random rand = new Random();
        int bomPlaced = 0;
        while (bomPlaced < BOM_COUNT) {
            int row = rand.nextInt(ROWS);
            int col = rand.nextInt(COLS);
            if (data[row][col] != 1) {
                data[row][col] = 1;
                bomPlaced++;
            }
        }
    }

    private void initBoardDisplay() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '*';
                revealed[i][j] = false;
            }
        }
    }

    public void displayBoard() {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < ROWS; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean guess(int row, int col) {
        if (gameOver) {
            System.out.println("Permainan sudah selesai!");
            return false;
        }

        if (revealed[row][col]) {
            System.out.println("Kotak sudah digosok sebelumnya!");
            return true;
        }

        revealed[row][col] = true;

        if (data[row][col] == 1) {
            board[row][col] = 'X';
            gameOver = true;
            bombExploded = true;
            System.out.println("BOOM! Anda terkena bom. Permainan berakhir.");
            return false;
        } else {
            board[row][col] = 'O';
            safeCount++;

            if (safeCount == (ROWS * COLS - BOM_COUNT)) {
                gameOver = true;
                System.out.println("Selamat! Anda berhasil membuka semua kotak aman!");
            } else {
                System.out.println("Aman! Lanjutkan.");
            }

            return true;
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isBombExploded() {
        return bombExploded;
    }
}    public boolean cekNomor(int n) {
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
