package MayinTarlasiProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int rowNumber;
    int colNumber;
    int size;
    int[][] map;
    int[][] board;
    boolean gamePlay = true;


    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row, col, success = 0;
        prepareGame();
        initializePrint(this.map);
        System.out.println("=================================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        while (gamePlay) {
            print(this.board);
            System.out.print("Satır Giriniz : ");
            row = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            col = scanner.nextInt();

            System.out.println("=================================");
            // row -> 3 col->3 verilirse max 2 girilebilir kordinat için
            if (row < 0 || row >= this.rowNumber) {
                System.out.println("Geçersiz bir kordinat girdiniz!");
                System.out.println("=================================");
                continue;
            }
            if (col < 0 || col >= this.colNumber) {
                System.out.println("Geçersiz bir kordinat girdiniz!");
                System.out.println("=================================");
                continue;
            }

            if (this.map[row][col] != -1) { // -1 değilse mayın yok bu yüzden etrafına bakacağız
                check(row, col);
                success++;
                if (success == (size - (size / 4))) { // başarılı tahmin ve mayın toplamı sayısı tüm kareleri temsil eder
                    System.out.println("Oyunu Kazandınız !");
                    gamePlay = false;
                }
            } else {
                gamePlay = false;
                System.out.println("Game Over!!");
            }

        }
    }

    private void check(int row, int col) {
        if (this.map[row][col] == 0) {
            if ((col < this.colNumber - 1) && (this.map[row][col + 1] == -1)) {
                this.board[row][col]++;
            }
            if ((row < this.rowNumber - 1) && (this.map[row + 1][col] == -1)) {
                this.board[row][col]++;
            }
            if ((row > 0) && (this.map[row - 1][col] == -1)) {
                this.board[row][col]++;
            }
            if ((col > 0) && (map[row][col - 1] == -1)) {
                this.board[row][col]++;
            }
            if (this.board[row][col] == 0) {
                this.board[row][col] = 0;
            }
            if (row > 0 && col > 0 && this.map[row - 1][col - 1] == -1) { // sol üst köşe
                this.board[row][col]++;
            }
            if (row > 0 && col < this.colNumber - 1 && this.map[row - 1][col + 1] == -1) { // sağ üst köşe
                this.board[row][col]++;
            }
            if (row < this.rowNumber - 1 && col > 0 && this.map[row + 1][col - 1] == -1) { // sol alt köşe
                this.board[row][col]++;
            }
            if (row < this.rowNumber - 1 && col < this.colNumber - 1 && this.map[row + 1][col + 1] == -1) { // sağ alt köşe
                this.board[row][col]++;
            }

        }
    }

    private void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != (this.size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (this.map[randRow][randCol] != -1) {
                this.map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    private void initializePrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    private void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
